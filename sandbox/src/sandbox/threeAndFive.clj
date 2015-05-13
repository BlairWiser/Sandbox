(ns sandbox.threeAndFive)

(defn x
  "Finds the sum of all multiples of 3 and 5 below the given number"
  [m]
  (loop [current 1 total 0]
    (if (= current m)
      total
      (recur (inc current) 
             (if (or (= (mod current 3) 0) (= (mod current 5) 0))
               (+ total current)
               total)))))

(println (x 10))