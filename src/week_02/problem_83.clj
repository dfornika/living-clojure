(ns week-02.problem-83)


(defn __ [& x]
  (and (contains? (set x) true)
       (not (every? identity x))))
