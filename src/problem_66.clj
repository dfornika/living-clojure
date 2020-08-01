(ns problem-66
  (:require [clojure.set]))

(defn __ [x y]
  (let [one-to-x (range 1 (inc x))
        one-to-y (range 1 (inc y))
        divisors-x (set (map first (filter #(val %) (zipmap one-to-x (map zero? (map #(mod x %) one-to-x))))))
        divisors-y (set (map first (filter #(val %) (zipmap one-to-y (map zero? (map #(mod y %) one-to-y))))))]
    (apply max (clojure.set/intersection divisors-x divisors-y))))

(= (__ 2 4) 2)

(= (__ 10 5) 5)

(= (__ 5 7) 1)

(= (__ 1023 858) 33)
