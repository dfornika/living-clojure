(ns week-01.problem-30)

(defn __ [coll]
  (seq (reduce #(if (= (last %) %2) % (conj % %2)) [] coll)))

(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
