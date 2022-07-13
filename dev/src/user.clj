(ns user)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn dev
  []
  (require 'dev)
  (in-ns 'dev)
  :loaded)