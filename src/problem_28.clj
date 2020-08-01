(ns problem-28)

(defn __ [x]
  (filter (complement sequential?)
          (tree-seq sequential? seq x)))

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))

(= (__ '((((:a))))) '(:a))(= (__ '((((:a))))) '(:a))
