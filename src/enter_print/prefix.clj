(ns enter-print.prefix
  (:require [clojure.test :refer :all]))

(defn longest-prefix [s] "")

(defn longest-prefix2
  [s]
  (if (not (= (first (s 0)) (first (s 1))))
    ""
    (str (first (s 0)))))

(defn longest-prefix3
  [s]
  (if (= (first (s 0)) (first (s 1)))
    [(first (s 0))]
    ""))

(defn take-the-char
  [s]
  (first s))

(defn take-the-char-of-strings
  [s]
  (vector (take-the-char (s 0))
       (take-the-char (s 1))))

(defn prefix
  [s]
  (loop [ith 0
         t []]
    ;t la cho chua common prefix
    (if (not (= ((s 0) ith) ((s 1) ith)))
      t
      (recur (inc ith) (conj t [(s 0) ith])))))
(prefix ["abc" "ajj"])
























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

