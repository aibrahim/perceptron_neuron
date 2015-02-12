(ns perceptrons.load_config
  (:require [clojure.java.io :as io]))

(defn load-config [filename]
  (with-open [r (io/reader filename)]
    (read (java.io.PushbackReader. r))))

(def perceptronsConfigFile "perceptrons.conf")
(def perceptronsConfigHash (load-config (do (io/resource perceptronsConfigFile))))
(def BIAS (:bias perceptronsConfigHash))
(def WEIGHT (:weight perceptronsConfigHash))


