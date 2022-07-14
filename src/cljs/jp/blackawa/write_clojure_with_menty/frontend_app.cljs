(ns jp.blackawa.write-clojure-with-menty.frontend-app)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]} ;; shadow-cljsから直接呼ばれるため.
(defn init
  []
  (js/console.log "Hello from clojurescript!"))
