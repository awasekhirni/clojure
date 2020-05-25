;Copyright 2017-18 Clojure Programming
;Syed Awase Khirni awasekhirni@gmail.com
;www.sycliq.com www.territorialprescience.com 

;importing the necessary packages for document string(help document)
(require '[clojure.repl :refer [doc]])

(defn displayinfo "to display employee and department info here!" [name department] (str "Welcome," name " you will be joning:" department))

(doc displayinfo)
(println(displayinfo "SyedAwase" "R&D"))

;variadic arguments function 
(defn manynotes [& args]
   (str "mybucketlist is:" (apply str args)))

(println (manynotes "milk" "bread" "eggs"))

;recursion in clojure 
(defn compute-sum [total vals]
   (if (empty? vals)
   total
   (compute-sum (+ (first vals) total) (rest vals))))

;recursively computes the sum 
(println (compute-sum 0 [23 24 25 26 27 28]))



(defn argcount
  ([] 0)
  ([x] 1)
  ([x y] 2)
  ([x y & more] (+ (argcount x y) (count more))))

(println (argcount))
(println (argcount 11 12 13))

;multi-variadic function to compute sum 
; (defn compute-product 
;   ([] 0)
;   ([vals] (compute-product 0 vals))
;   ([total vals] 
;    (if (empty? vals)
;    total
;    (compute-product (* (first vals) total) (rest vals)))))


   
(defn calculate-salary
  [years salary]
  (if (zero? years)
    salary
    (recur (dec years) (* salary 2))))

(println (calculate-salary 10 120000))


; (defn compute-product [total & more]
;   (if (empty? more)
;   total
;   (apply compute-product (* (first more) total (rest more)))))


; ; recursively compute the product using a multivariadic function 
; (println (compute-product 0 [11 12 13 14 15 16 17 18 19 20]))