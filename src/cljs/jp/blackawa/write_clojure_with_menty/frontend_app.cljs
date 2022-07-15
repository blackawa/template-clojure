(ns jp.blackawa.write-clojure-with-menty.frontend-app
  (:require [rum.core :refer [mount defc]]))

(defc root
  []
  [:h1 "Hello from ClojureScript!"])

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]} ;; shadow-cljsから直接呼ばれるため.
(defn init
  []
  (js/console.log "Hello from clojurescript!")
  (mount (root) (js/document.getElementById "app")))
