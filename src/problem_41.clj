(ns problem-41)

; Write a function which drops every Nth item from a sequence.

(defn __ [x n]
  (loop [index 1
         x x
         result []]
    (if (empty? x)
      result
      (if (zero? (mod index n))
        (recur (inc index) (rest x) result)
        (recur (inc index) (rest x) (conj result (first x)))))))

(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])

(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
