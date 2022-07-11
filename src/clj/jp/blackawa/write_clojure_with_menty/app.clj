(ns jp.blackawa.write_clojure_with_menty.app
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defonce server
  (atom nil))

(defn start!
  []
  (reset! server (run-jetty (fn [req]
                              (println "request:" req)
                              {:status 200
                               :content-type "text/html"
                               :body "<!doctype html><html><body><h1>Hello from clojure!</h1></body></html>"})
                            {:port 3000
                             :join false})))

(defn stop!
  []
  (.stop @server)
  (reset! server nil))

(defn -main
  [& _]
  (println "This application does nothing, yet..."))