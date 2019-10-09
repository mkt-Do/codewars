(ns codewars.no-zeros-for-heros-test
  (:use clojure.test
        codewars.no-zeros-for-heros))

(defn testZeros [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "noboringzeros"   
    (testZeros  (no-boring-zeros 1450) 145)
    (testZeros  (no-boring-zeros 960000) 96)
    (testZeros  (no-boring-zeros 1050) 105)
    (testZeros  (no-boring-zeros -960000) -96)
))
