;; Use $ operator to access nested Java classes

(def handler (proxy [Thread$UncaughtExceptionHandler] []
	(uncaughtException [thread exception]
		(println thread exception))))

(Thread/setDefaultUncaughtExceptionHandler handler)

(/ 12 0)