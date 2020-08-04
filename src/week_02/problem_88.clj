(ns week-02.problem-88
  (:require [clojure.set]))

; Write a function which returns the symmetric difference of two sets. The symmetric difference is the set of items belonging to one but not both of the two sets.

(defn __ [a b]
  (set (filter some? (concat (for [a-member a]
                              (if (not (contains? b a-member))
                                a-member))
                            (for [b-member b]
                              (if (not (contains? a b-member))
                                b-member))))))

(= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})

(= (__ #{:a :b :c} #{}) #{:a :b :c})

(= (__ #{} #{4 5 6}) #{4 5 6})

(= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})
