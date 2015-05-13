(ns sandbox.sumSquareDif)

(defn ssdif
  "Finds difference between square of sum and sum of squares 
  of all natural numbers up to n"
  [n]
  (- (reduce + (range n+1)) ()))