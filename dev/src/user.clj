(ns user
  (:require [jp.blackawa.write_clojure_with_menty.app :refer [server reset!]]
            [shadow.cljs.devtools.api :as shadow-api]
            [shadow.cljs.devtools.server :as shadow-server]
            ))

(defn start-cljs!
  []
  (shadow-server/start!)
  (shadow-api/watch :app))
