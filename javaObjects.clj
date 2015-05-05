;; Create a java object with new, use def to assign to a Clojure var
(def rng (new java.util.Random))

;; call methods of objects with dot
(println (. rng nextInt))
;; Can call version with argument by adding arg to list
(println (. rng nextInt 10))

;; java.lang is already imported by default
(println (. Math PI))

;; import package for ease of use
(import '(java.util Random))