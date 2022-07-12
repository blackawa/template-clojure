(ns jp.blackawa.write-clojure-with-menty.handler 
  (:require [clojure.java.io :as io]
            [reitit.ring :as ring]))

(defn app-page
  [req]
  {:status 200
   :content-type "text/html"
   :body (slurp (io/resource "index.html"))})

(def routing
  (ring/ring-handler
   (ring/router
    [["/"
      ["app/*" {:get app-page}]
      ["assets/*" (ring/create-resource-handler)]]])
   (constantly {:status 404, :body ""})))
