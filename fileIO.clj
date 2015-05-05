(ns fileReader
	(:require [clojure.java.io :as io]))

(with-open [rdr (io/reader "test.txt")]
	(doseq [line (line-seq rdr)]
	(println line)))