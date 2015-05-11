(ns sandbox.dataStructures)

;; Maps
;; Key-value pairs, often use keywords (start with ":") as key
(def m {:a "Iron Man", :b "Hulk", :c "Thor", :d "Captain America"})
;; Keywords can act as function, look themselves up
(:a m)
;; Can also use map as a function
(m :b)
;; Can also lookup with get
(get m :d)
;; get has optional 3rd argument, return this when not found
(get m :g "Not found")
;; key word look up also has this optional argument
(:z m "Who?")
;; get-in looks up value in nested Maps
(get-in {:a 1, :b 2, :c {:d "nest"}} [:c :d])
;; Can use hash-map function to create a map. It handles duplicate keys
;; Don't use curly braces when you use this, sends a map as an argument!
(:key (hash-map :key "hello", :key "World"))

;; Vectors
;; Basically arrays, 0-indexed collection
(def v ["blue" "red" "yellow" "green"])
;; Can access v's elements by using it as a function
(v 2)
;; Can also access with get
(get v 2)
;; First way returns exception, get will return nil
(v 5) ;; Exception
(get v 5) ;; Nil
;; Create a vector with vector function
(vector "one" "two" "three")
;; When using conj elements added to back
(conj v "purple")
;; Cons adds to front as always
(cons "purple" v)

;; Lists
;; Linear collection of values
(def l '("cat" "dog" "fish" "hamster"))
;; Can't use get on Lists
(get l 0) ;; nil
;; Can use nth which performs linear search, slower than vector index
(nth l 0)
;; Can create with list function
(list 1 2 3 4)
;; conj adds to beginning
(conj l "turtle")
;; cons adds to beginning as always
(cons "turtle" l)

;; Sets
;; Collections of unique values
(def s #{"Toronto" "Brampton" "Oshawa" "Mississauga"})
;; Can't add a value already in the set 
(conj s "Brampton") ;; Returns same set
;; Can use get to check if a value exists in a set
(get s "Toronto") ;; returns Toronto
(get s "Hamilton") ;; returns nil
;; The set function can take vectors and lists as arguments
;; can be used to check existance in other collections
(set v)
;; Can also create a sorted-set
(sorted-set :d :b :a :c)

;; Doing things to data data structures 
;; The map function applies a function to each element of a struct
;; (not to be confused with data struct) 
(map inc [0 1 2 3 4])
;; The reduce function applies a function to the first two elements,
;; it then applies the function to the result and the next element
;; repeat this until finished
(reduce + [1 2 3 4])
;; is equivalent to 
(+ (+ (+ 1 2) 3) 4)
;; Reduce can also take an initial value
(reduce + 15 [1 2 3 4])