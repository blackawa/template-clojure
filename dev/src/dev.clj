(ns dev
  #_{:clj-kondo/ignore [:unused-namespace]}
  #_{:clj-kondo/ignore [:unused-referred-var]}
  (:require
   ;; [clojure.tools.namespace.repl :refer [refresh]]
   [jp.blackawa.write-clojure-with-menty.backend-app :refer [stop-backend! start-backend!]]
   [jp.blackawa.write-clojure-with-menty.system :refer [system]]
   [jp.blackawa.write-clojure-with-menty.migration :as migration]))

(defn reset-system
  []
  (stop-backend!)
  ;; (refresh)
  (start-backend!))