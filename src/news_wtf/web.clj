(ns news-wtf.web
  (:use ring.adapter.jetty))

(defn app [req]
  {:status 200
   :header {"Content-Type" "text/plain"}
   :body "Hello from Clojure!\n"})

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app {:port port})))
