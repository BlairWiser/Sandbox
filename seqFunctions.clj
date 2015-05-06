;; Maps

(println (get {:sundance "spaniel", :darwin "beagle"} :darwin))
(println (get {:sundance "spaniel", :darwin "beagle"} :snoopy))

;; Maps can be confusing when nil is a value, use contains? to be sure
(def score {:stu nil, :joey 100})
(println (score :stu))
(println (contains? score :stu))

;; Optional third argument is returned if nothing found
(println (get score :stu :score-not-found))
(println (get score :aron :score-not-cound))

;; Map creation functions
;; Remember data is immutable, each function is creating a new collection
(def song {:name "Agnus Dei"
		   :artist "Krzysztof Penderecki"
		   :album "Polish Requiem"
		   :genre "Classical"})

(println (assoc song :kind "MPED Audio File"))
(println (dissoc song :genre))
(println (select-keys song [:name :artist]))
(println (merge song {:size 8118166, :time 507245}))

