;
(println "indojinwomigini")

(defn argc
 ([] 0)
 ([x] 1)
 ([x & more] (+ x (argc more))))

;
