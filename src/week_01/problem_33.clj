(ns week-01.problem-33)

; Write a function which replicates each element of a sequence a variable number of times.

(defn __ [x n]
  (loop [input x
         result []]
    (if (empty? input)
      result
      (recur (rest input) (concat result (repeat n (first input)))))))

(= (__ [1 2 3] 2) '(1 1 2 2 3 3))

(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= (__ [4 5 6] 1) '(4 5 6))

(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= (__ [44 33] 2) [44 44 33 33])
