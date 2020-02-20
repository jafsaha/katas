(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(deftest bowling 
  (testing "strikes for all rolls"
    (is (= 300 (score "XXXXXXXXXXXX")))))

