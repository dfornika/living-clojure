(ns week-02.problem-26)

; Write a function which returns the first X fibonacci numbers.
(defn __ [x]
  (loop [i 0
         result []]
    (cond (>= i x) result
          (> 2 i) (recur (inc i) (conj result 1))
          :else (recur (inc i) (conj result (+ (last result) (last (butlast result))))))))


(= (__ 3) '(1 1 2))

(= (__ 6) '(1 1 2 3 5 8))

(= (__ 8) '(1 1 2 3 5 8 13 21))
