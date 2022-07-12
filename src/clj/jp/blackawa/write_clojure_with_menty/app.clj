(ns jp.blackawa.write_clojure_with_menty.app
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [jp.blackawa.write-clojure-with-menty.handler :refer [routing]]))

(defonce server
  (atom nil))

(defn start!
  []
  (reset! server (run-jetty routing
                            {:port 3000
                             :join? false})))

(defn stop!
  []
  (.stop @server)
  (reset! server nil))

(defn reset!
  []
  (when @server
    (stop!))
  (start!))

(defn -main
  [& _]
  (println "This application does nothing, yet..."))
