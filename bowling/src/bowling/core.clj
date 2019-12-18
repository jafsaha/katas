(ns bowling.core
  (:require [clojure.string :as str]))

(defn parse-roll
  [roll]
  (case roll
    "X" 10
    "-" 0
    (Integer/parseInt roll)))


(defn score [rolls]
  (let [tiradas (str/split "9-9-9-9-9-9-9-9-9-9-" #"")]
    (reduce + (map parse-roll tiradas))))