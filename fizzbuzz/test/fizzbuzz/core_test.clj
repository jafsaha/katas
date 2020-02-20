(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz 
  (testing "Fizz"
    (is (= 300 (score "XXXXXXXXXXXX")))))

