(ns jp.blackawa.write-clojure-with-menty.view
  (:require [rum.core :refer [defc]]))

(defc app
  []
  [:html
   [:body
    [:h1 "Hello from Clojure!"]
    [:#app]
    [:script {:src "/js/main.js"}]]])