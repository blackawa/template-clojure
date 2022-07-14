(ns jp.blackawa.write-clojure-with-menty.handler 
  (:require [clojure.data.json :as json]
            [next.jdbc :as jdbc]
            [reitit.ring :as ring]
            [rum.core :refer [defc render-static-markup]]
            [jp.blackawa.write-clojure-with-menty.system :refer [system]]))

(defc app-html
  []
  [:html
   [:body
    [:h1 "Hello from Clojure!"]
    [:script {:src "/js/main.js"}]]])

(defn app-page
  [req]
  {:status 200
   :content-type "text/html"
   :body (render-static-markup (app-html))})

(defn index
  [req]
  (let [ds (:datasource @system)]
    {:status 200
     :headers {"content-type" "application/json"}
     :body (json/write-str {:found (jdbc/execute! ds ["select * from tasks"])})}))

(defn fetch
  [req])

(defn create!
  [req])

(defn update!
  [req])

(defn delete!
  [req])

(def routing
  (ring/ring-handler
   (ring/router
    [["/api"
      ["/tasks" {:get index
                 :post create!}]
      ["/task/:task-id" {:get fetch
                         :put update!
                         :delete delete!}]]
     ["/app/*" {:get app-page}]
     ["/*" (ring/create-resource-handler)]]
    {:conflicts (constantly nil)})
   (ring/routes
    (ring/redirect-trailing-slash-handler {:method :strip})
    (ring/create-default-handler))))
