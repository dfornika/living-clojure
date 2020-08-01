(ns problem-39)

(defn __ [x y]
  (loop [x x
         y y
         result []]
    (if (or (nil? (first x)) (nil? (first y)))
      result
      (recur (rest x) (rest y) (conj result (first x) (first y))))))

(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (__ [1 2] [3 4 5 6]) '(1 3 2 4))

(= (__ [1 2 3 4] [5]) [1 5])

(= (__ [30 20] [25 15]) [30 25 20 15])