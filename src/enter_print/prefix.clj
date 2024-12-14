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






















