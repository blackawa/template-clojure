(ns jp.blackawa.write-clojure-with-menty.backend-app
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [jp.blackawa.write-clojure-with-menty.handler :refer [routing]]))

(defonce server
  (atom nil))

(defn start-backend!
  []
  (when-not @server
    (reset! server (run-jetty #'routing
                              {:port 3000
                               :join? false}))))

(defn stop-backend!
  []
  (when @server
    (.stop @server))
  (reset! server nil))

(defn restart-backend!
  []
  (when @server
    (stop-backend!))
  (start-backend!))
