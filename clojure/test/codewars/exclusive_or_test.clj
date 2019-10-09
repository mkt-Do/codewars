(ns codewars.exclusive-or-test
  (:use clojure.test
        codewars.exclusive-or))

(deftest Tests
  (is (= (xor false false) false) "false xor false === false")
  (is (= (xor true false) true) "true xor false === true")
  (is (= (xor false true) true) "false xor true === true")
  (is (= (xor true true) false) "true xor true === false")
  (is (not= (xor true true) true) "'xor' is NOT identical to 'or'")
)
