;; To run this file in the REPL use:
;; (use :reload 'sandbox.hello)

(ns sandbox.hello)

(import '(java.util Random))
(let [rand (Random.)]
	(println "Rand = " (. rand nextInt 10)))

(def rng (new Random))
(println "RNG = " (.nextInt rng 100))

;; Accessing static members and methods
(println "Pi is " Math/PI)
(println "Sqrt of 9 is " (Math/sqrt 9))

;; Accessing Java's string functions
(println (.toUpperCase "I am excited!"))
(println (.indexOf "Let's find the S" "S"))

(println "=================")

