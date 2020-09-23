package com.github.mktdo.codewars

object ScottEncoding {

  trait STuple[+A, +B] {
    def apply[C]: ((A, B) => C) => C
  }

  trait SOption[+A] {
    def apply[B]: (=> B, A => B) => B
  }

  trait SEither[+A, +B] {
    def apply[C]: (A => C, B => C) => C
  }

  trait SList[+A] {
    def apply[B]: (=> B, (A, SList[A]) => B) => B
  }

  def toTuple[A, B](tuple: STuple[A, B]): (A, B) = tuple.apply((a, b) => (a, b))

  def fromTuple[A, B](tuple: (A, B)): STuple[A, B] = new STuple[A, B] {
    def apply[C] = f => f(tuple._1, tuple._2)
  }

  def fst[A, B](tuple: STuple[A, B]): A = tuple.apply((a, _) => a)

  def snd[B](tuple: STuple[_, B]): B = tuple.apply((_, b) => b)

  def swap[A, B](tuple: STuple[A, B]): STuple[B, A] = new STuple[B, A] {
    def apply[C] = f => f(snd[B](tuple), fst[A, B](tuple))
  }

  def curry[A, B, C](f: STuple[A, B] => C): A => B => C = a => b => f(new STuple[A, B] {
    def apply[C] = g => g(a, b)
  })

  def uncurry[A, B, C](f: A => B => C): STuple[A, B] => C = tuple => f(fst(tuple))(snd(tuple))

  def toOption[A](option: SOption[A]): Option[A] = option.apply(None, some => Some(some))

  def fromOption[A](option: Option[A]): SOption[A] = option match {
    case Some(some) => new SOption[A] { def apply[B] = (_, f) => f(some) }
    case None => new SOption[A] { def apply[B] = (none, _) => none }
  }

  def isSome(option: SOption[_]): Boolean = option.apply(false, _ => true)

  def isNone(option: SOption[_]): Boolean = option.apply(true, _ => false)

  def catOptions[A](list: SList[SOption[A]]): SList[A] = list.apply(nil[A], (option, l) => option.apply(catOptions(l), some => cons(some, catOptions(l))))

  def toEither[A, B](either: SEither[A, B]): Either[A, B] = either.apply(left => Left(left), right => Right(right))

  def fromEither[A, B](either: Either[A, B]): SEither[A, B] = either match {
    case Left(left) => new SEither[A, B] { def apply[C] = (f, _) => f(left) }
    case Right(right) => new SEither[A, B] { def apply[C] = (_, f) => f(right) }
  }

  def isLeft[A](either: SEither[A, _]): Boolean = either.apply(_ => true, _ => false)

  def isRight[A](either: SEither[A, _]): Boolean = either.apply(_ => false, _ => true)

  def nil[A]: SList[A] = new SList[A] {
    def apply[B] = (Nil, _) => Nil
  }

  def toList[A](list: SList[A]): List[A] = list.apply(Nil, (a, l) => List(a) ++ toList(l))

  def fromList[A](list: List[A]): SList[A] = list match {
    case Nil => nil[A]
    case h :: t => cons[A](h, fromList(t))
  }

  def cons[A](head: A, list: SList[A]): SList[A] = new SList[A] {
    def apply[B] = (_, f) => f(head, list)
  }

  def concat[A](left: SList[A], right: SList[A]): SList[A] = left.apply(right, (a, l) => cons[A](a, concat(l, right)))

  def empty(list: SList[_]): Boolean = list.apply(true, (_, _) => false)

  def length(list: SList[_]): Int = list.apply(0, (_, l) => 1 + length(l))

  def map[A, B](f: (A => B), list: SList[A]): SList[B] = list.apply(nil[B], (a, l) => cons[B](f(a), map(f, l)))

  def zip[A, B](listA: SList[A], listB: SList[B]): SList[STuple[A, B]] = listA.apply(nil[STuple[A, B]], (a, lA) => {
    listB.apply(nil[STuple[A, B]], (b, lB) => cons[STuple[A, B]](new STuple[A, B] {
      def apply[C] = f => f(a, b)
    }, zip(lA, lB)))
  })

  def foldLeft[A, B](f: ((B, A) => B), z: B, list: SList[A]): B = list.apply(z, (a, l) => foldLeft(f, f(z, a), l))

  def foldRight[A, B](f: ((A, B) => B), z: B, list: SList[A]): B = list.apply(z, (a, l) => f(a, foldRight(f, z, l)))

  def take[A](n: Int, list: SList[A]): SList[A] = list.apply(nil[A], (a, l) => if (n > 0) cons[A](a, take(n - 1, l)) else nil[A])

  def partition[A, B](list: SList[SEither[A, B]]): STuple[SList[A], SList[B]] = list.apply(new STuple[SList[A], SList[B]] {
    def apply[C] = f => f(nil[A], nil[B])
  }, (e, l) => e.apply(
    left => partition(l).apply((al, bl) => new STuple[SList[A], SList[B]] { def apply[C] = f => f(cons[A](left, al), bl) }),
    right => partition(l).apply((al, bl) => new STuple[SList[A], SList[B]] { def apply[C] = f => f(al, cons[B](right, bl)) })
  ))
}
