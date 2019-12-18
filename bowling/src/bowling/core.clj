(ns bowling.core)

(defn score [rolls]
  (case rolls
    "XXXXXXXXXXXX" 300
    "9-9-9-9-9-9-9-9-9-9-" 90
    "5/5/5/5/5/5/5/5/5/5/5" 150))

(defn score-one [rolls]
  (cond
    (= (first rolls) \X) [10 :strike (subs rolls 1)]
    (Character/isDigit (first rolls)) (let [value (Integer/parseInt (subs rolls 0 1))
                                            sign (subs rolls 1 2)
                                            rest (subs rolls 2)]
                                        [value (case sign
                                                 "-" :miss
                                                 "/" :spare) rest])))

(defn score-many [rolls]
 (if (empty? rolls)
   []
   (let [[score type rest] (score-one rolls)]
     (conj [score type] (score-many rest)))))
