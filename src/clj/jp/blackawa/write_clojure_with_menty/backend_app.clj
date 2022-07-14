(ns jp.blackawa.write-clojure-with-menty.backend-app
  (:require [next.jdbc :as jdbc]
            [ring.adapter.jetty :refer [run-jetty]]
            [jp.blackawa.write-clojure-with-menty.system :refer [system]]
            [jp.blackawa.write-clojure-with-menty.handler :refer [routing]]))

(defn start-backend!
  []
  (if @system
    ::already-running
    (reset! system {:server (run-jetty #'routing
                               {:port 8080
                                :join? false})
                    :datasource (jdbc/get-datasource {:dbtype "h2"
                                                      :dbname "app"})})))

(defn stop-backend!
  []
  (if-let [{:keys [server]} @system]
    (do (.stop server)
        (reset! system nil)
        ::stopped)
    ::already-stopped))
