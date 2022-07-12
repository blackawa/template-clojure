(ns jp.blackawa.write-clojure-with-menty.handler 
  (:require [reitit.ring :as ring]))

(defn index-page
  [req]
  (println "request:" req)
  {:status 200
   :content-type "text/html"
   :body "<!doctype html><html><body><h1>Hello from clojure!!</h1></body></html>"})

(def routing
  (ring/ring-handler
   (ring/router
    [["/" {:get index-page}]
     ["/public/*" (ring/create-resource-handler)]])))
