(ns codewars.detect-pangram
  (:require [clojure.string :refer [lower-case]]))

(defn pangram?
  [s]
  (= (seq "abcdefghijklmnopqrstuvwxyz") (sort #(compare %1 %2) (filter #(and (>= (int %1) (int \a)) (<= (int %1) (int \z))) (distinct (lower-case s))))))
