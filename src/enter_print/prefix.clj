(ns enter-print.prefix
  (:require [clojure.test :refer :all]))

(defn single-common-char
  [s]
  (let [v (first s)]
    (if (some #(not= v %) (rest s))
      ""
      (str v))))

(defn longest-prefix
  [s]
  (if (some #(= "" %) s)
    ""
    (let [prefix (single-common-char (map first s))]
      (if (= prefix "")
        ""
        (str prefix (longest-prefix (map rest s)))))))

(longest-prefix ["ab" "ab"])





















(deftest test-longest-prefix
  (testing "Common prefix exists"
    (is (= "fl" (longest-prefix ["flower" "flow" "flight"])))
    (is (= "test" (longest-prefix ["testcase" "testdata" "testing"]))))
  (testing "No common prefix"
    (is (= "" (longest-prefix ["dog" "cat" "fish"])))
    (is (= "" (longest-prefix ["apple" "banana" "cherry"]))))
  (testing "Edge cases"
    (is (= "" (longest-prefix []))) ; Empty list of strings
    (is (= "" (longest-prefix [""]))) ; Single empty string
    (is (= "a" (longest-prefix ["a"]))) ; Single character string
    (is (= "hello" (longest-prefix ["hello" "hello" "hello"])))))
 ; Identical strings

