(ns codewars.no-zeros-for-heros)

(defn no-boring-zeros [n]
  (if (= \0 (last (str n)))
    (let [cs (drop-last (str n))]
      (if (empty? cs)
        0
        (no-boring-zeros (Integer/parseInt (apply str cs)))))
    n))
