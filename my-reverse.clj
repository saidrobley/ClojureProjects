(defn aux-reverse [ a b ]
  "return the list obtained by .... "
  (if (= a ())
              b
              (aux-reverse (rest a) (cons (first a) b) )
  )
)
;=========================================================
(defn my-reverse [ x ]
  "return the given list in reversed order"
  (aux-reverse x () )
)

(my-reverse '(1 2 3 4 5 6))
;output: (6 5 4 3 2 1)