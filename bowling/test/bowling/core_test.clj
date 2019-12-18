(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(deftest bowling 
  (testing "score for one strike"
    (is (= [10 :strike "XXXXXXXXXXX"] (score-one "XXXXXXXXXXXX"))))

  (testing "score for one spare"
    (is (= [5 :spare "XXXXXXXXXXX"] (score-one "5/XXXXXXXXXXX"))))

  (testing "score for one miss"
    (is (= [5 :miss "XXXXXXXXXX"] (score-one "5-XXXXXXXXXX"))))

  (testing "score for two strikes"
    (is (= [[10 :strike] [10 :strike]] (score-many "XX"))))

  (testing "score empty rolls"
    (is (= [] (score-many ""))))

  (testing "all 9-misses"
    (is (= 90 (score "9-9-9-9-9-9-9-9-9-9-"))))

  (testing "all 5-spares"
    (is (= 150 (score "5/5/5/5/5/5/5/5/5/5/5")))))

