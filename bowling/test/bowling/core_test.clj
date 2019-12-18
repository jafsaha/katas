(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(deftest bowling
  (testing "strikes for all rolls"
    (is (= 300 (score "XXXXXXXXXXXX"))))

  (testing "20 rolls: 10 pairs of 9 and miss"
    (is (= 90 (score "9-9-9-9-9-9-9-9-9-9-"))))

  (testing "21 rolls: 10 pairs of 5 and spare, with a final 5"
    (is (= 150 (score "5/5/5/5/5/5/5/5/5/5/5")))))


(deftest parse-roll-test
  (testing "X => 10"
    (is (= 10 (parse-roll "X"))))

  (testing "- => 0"
    (is (= 0 (parse-roll "-"))))

  (testing "1 => 1:int"
    (is (= 1 (parse-roll "1")))))