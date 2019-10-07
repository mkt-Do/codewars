(ns codewars.descending-order-test
  (:use clojure.test
        codewars.descending-order))

(deftest test-cases
  (are [n expected]
    (= expected (desc-order n))
    0          0
    1          1
    15         51))
