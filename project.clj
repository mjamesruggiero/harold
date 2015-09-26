(defproject harold "0.1.0-SNAPSHOT"
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler harold.core/handler}
  :description "Liberator experimentation"
  :url "http://mjamesruggiero.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                  [liberator "0.13"]
                  [compojure "1.3.4"]
                  [ring/ring-core "1.2.1"]])
