(ns codewars.descending-order)

(defn desc-order [n]
  (Integer/parseInt (apply str (sort #(compare %2 %1) (str n)))))
