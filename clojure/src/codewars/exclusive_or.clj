(ns codewars.exclusive-or)

(defn xor [a b]
  (or (and (true? a) (false? b)) (and (false? a) (true? b))))
