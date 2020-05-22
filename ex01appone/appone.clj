;this is a single line comment
;namespace declaration appone
(ns appone) nil 
; single print statement 
(println "Welcome to Clojure programming -Syed ") nil
;checking the type of the variable in clojue 
; java.lang.Long 
(println(type 786))
; java.lang.Double 
(println(type 6.626070))
; string type check 
(println(type "syed awase"))
; keyword type 
(println(type (keyword "syed")))
; symbol type 
(println(type (quote me)))
; alternative symbol type check
(println(type 'me))
; list type check 
; lists are linked list data structures in clojure
(println(type (list 23 24 25)))
; list type check alternatively 
(println(type (list 11 12 13)))
; vector type check alternative 
; vectors are more like arrays in clojure 
(println(type (vector 23 24 25)))
; index access operation using nth 
; index 3 will fetch the 4th element as vectors are 0 based index
(println(nth (vector 23 24 25 26 27 28 29 30) 3))
;first element of the list 
(println(first (list 23 24 25 26 27 28 29)))
; last elemnet of the list 
(println(last (list 91 92 93 94 95 96 97 98 99)))
; sets in clojure 
(println(type #{22 67 93 104}))
; immutable variables in clojure 
(def pi "3.1456")
(println pi)

(let [k 6.626070]
 (println k))

 ;conditionals in clojure 
 (def g "glass is half full")
 (if (empty? g)
    (println "glass is empty")
    (println "glass is full")) 
;nil is false 
(if nil
   (println "Yes")
   (println "No"))

;do operation 
; to perform an operation for side effect
; best practice try to avoid using do
(if (empty? g)
   nil 
   (do 
   (println "OK")
   :OK))

;if-not 
(if-not (empty? g)
 (println "glass is empty")
 (println "glass is full"))

;when-not 
(when-not (empty? g)
  (println "glass is empty")
  (println "glass is full"))

;switch statement in clojure are cases 
(def viva "aicy")
(case viva 
   "aicy" :SyedAwaseKhirni
   "munna" :SyedAmeeseSadath
   "abu" :SyedAzeezAlAsaad
   :nothing)

; conditional that does not require a predicate 
( cond 
 (= viva "SyedAwasekhirni")
 (= (apply str(reverse viva)) "inrihkesawadeys")
 :otherwise :nothing)


;functions in closure 
 ((fn [] "Welcome to Clojure"))
 ;named functions 
 (def callu (fn [] "kallu! Mama!"))

 ;evaluating function 
 (callu)

 ;alternative approach 
 (defn meemo [] "incredibles2")

 (defn greet [name] (str "Hello!," name))

 ;calling greet 
 (println(greet "SyedAwase"))

 ;functions with multiple arguments 
 ; functions with documentation strings
 (defn employee "defines an employee function" [name department] (str "Hello, " name " of " department ))

 (println(employee "SyedAwase" "Research"))


