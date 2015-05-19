(ns web.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.middleware.json :as middleware]
            [ring.util.response :as resp])
  (:use opennlp.nlp))

;; Start with lein ring server from Desktop/Sandbox/web

(def get-sentences (make-sentence-detector "resources/opennlp/en-sent.bin"))

(defroutes app-routes
  (GET "/" [] (resp/resource-response "front.html" {:root "public"}))
  (POST "/" request
        (let [sentence (or (get-in request [:body :sentence]) 
                           (get-in request [:data :sentence])
                           "I study quantum physics.")]
          {:status 200
           :body {:sentence sentence
                  :prob (:probabilities (meta (get-sentences sentence)))}}))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
(-> (handler/site app-routes)
  (middleware/wrap-json-body {:keywords? true}) 
  (middleware/wrap-json-response)))