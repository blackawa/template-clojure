(ns dev
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            ;; [shadow.cljs.devtools.api :as shadow-api]
            ;; [shadow.cljs.devtools.server :as shadow-server]
            [jp.blackawa.write-clojure-with-menty.backend-app :refer [stop-backend! start-backend!]]))

(comment (defn start-frontend!
           []
           (shadow-server/start!)
           (shadow-api/watch :frontend-app))
         )

(defn reset-system
  []
  (stop-backend!)
  (refresh)
  (start-backend!)
  ;; (start-frontend!)
  )
