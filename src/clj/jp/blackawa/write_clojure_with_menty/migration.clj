(ns jp.blackawa.write-clojure-with-menty.migration
  (:require [next.jdbc :as jdbc]))

(defn create-tasks-table
  [system]
  (if-let [ds (:datasource @system)]
    (jdbc/execute! ds ["create table tasks (
                          id int primary key auto_increment,
                          title varchar(128) not null,
                          description varchar(1024),
                          completed_at timestamp
                        )"])
    ::datasource-is-not-created))