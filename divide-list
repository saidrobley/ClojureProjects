(defn divide-list [index a]
   (if (= index 0 )
      (list (cons (first a) ()) (rest a))
      (list (cons (first a) (first (dividelist (- index 1) (rest a)))) 
                  (second (dividelist (- index 1) (rest a))))
   )
  
)
(divide-list 4 '(1 -2 0 3 7 5 6 6))

;output: ((1 -2 0 3 7) (5 6 6))
