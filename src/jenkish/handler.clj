(ns jenkish.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response  :refer :all]))

(defroutes app-routes
  (GET "/" [] (redirect  "/index.html"))
  (GET "/jobs/:name/stats" [name] (str "job stats for " name))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
