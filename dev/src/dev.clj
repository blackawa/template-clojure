(ns dev
  #_{:clj-kondo/ignore [:unused-namespace]} 
  (:require
   #_{:clj-kondo/ignore [:unused-referred-var]}
   [clojure.tools.namespace.repl :refer [refresh]] 
   [jp.blackawa.write-clojure-with-menty.backend-app :refer [stop-backend! start-backend!]]
   #_{:clj-kondo/ignore [:unused-referred-var]}
   [jp.blackawa.write-clojure-with-menty.system :refer [system]]
   [jp.blackawa.write-clojure-with-menty.migration :as migration]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn reset
  []
  (stop-backend!)
  (refresh)
  (start-backend!))
