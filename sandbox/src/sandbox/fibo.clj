(ns sandbox.fibo)

(defn fibo
  "Calculates the n'th fibonacci number"
  [n]
  (loop [current 1 upcoming 1 c n]
    (if (zero? c)
      current
      (recur upcoming (+ current upcoming) (dec c)))))

(println (fibo 10))