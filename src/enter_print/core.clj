(ns enter-print.core)

(defn nhap-so
  []
  (loop [n (Integer/parseInt (read-line))
         s []]
    (if (= n 0)
      s
      (recur (dec n) (conj s (Integer/parseInt (read-line)))))))

(nhap-so)
(apply max (nhap-so))
(defn max
  []
  (apply max (nhap-so)))
(max)














    

























