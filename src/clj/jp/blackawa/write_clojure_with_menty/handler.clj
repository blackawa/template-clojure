(ns jp.blackawa.write-clojure-with-menty.handler 
  (:require [clojure.java.io :as io]
            [reitit.ring :as ring]))

(defn app-page
  [req]
  (println "req:" req)
  {:status 200
   :content-type "text/html"
   :body (slurp (io/resource "index.html"))})

(def routing
  (ring/ring-handler
   (ring/router
    [["/api/_health" {:get (fn [req] (println req) {:status 200 :body "healthy"})}]
     ["/app/*" {:get app-page}]
     ["/*" (ring/create-resource-handler)]]
    {:conflicts (constantly nil)})
   (ring/routes
    (ring/redirect-trailing-slash-handler {:method :strip})
    (ring/create-default-handler))))
