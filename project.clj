(defproject datascience-in-clojure "0.1.0-SNAPSHOT"
  :description "Learning statistics and data science with clojure"
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [incanter "1.9.0"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.4"]]
  :profiles {:uberjar {:aot :all}})

