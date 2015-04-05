;; gorilla-repl.fileformat = 1

;; **
;;; # Getting started with Stat 110
;; **

;; @@
(ns stat110.practice1
  (:require [gorilla-plot.core :as plot]
            [incanter.core :refer [choose factorial]]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; **
;;; ## Exercise 1.1
;;; 
;;; a) >
;;; b) =
;; **

;; **
;;; ## Exercise 1.2
;;; 
;;; Probability of a flush, not royal flush
;;; $$ \frac{4(\binom{5}{13}-1)}{\binom{5}{52}} $$
;; **

;; @@
(/ (* 4 (- (choose 13 5) 1)) (choose 52 5))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-double'>0.0019792532397574416</span>","value":"0.0019792532397574416"}
;; <=

;; @@
(/ (* (choose 13 2) (choose 4 2) (choose 4 2) 11 4) (choose 52 5))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-double'>0.0475390156062425</span>","value":"0.0475390156062425"}
;; <=

;; **
;;; ## Exercise 1.3
;;; 
;;; **a)** Choose n steps with replacement, order does not matter. 
;;; $$\binom{110+110-1}{110}$$ or $$\binom{111 + 109 -1}{111}$$
;; **

;; @@
(defn f [n k] (choose (+ n k -1) k))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;joyful-aurora/f</span>","value":"#'joyful-aurora/f"}
;; <=

;; @@
(f 109 111)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-double'>4.445368583193871E64</span>","value":"4.445368583193871E64"}
;; <=

;; @@
(f 110 110)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-double'>4.526934979215774E64</span>","value":"4.526934979215774E64"}
;; <=

;; **
;;; hmm somethings wrong
;;; 
;;; **b)** = number of paths from (0,0) to (110,111) times number of paths from (110,111) to (210,211)
;; **

;; **
;;; ## Exercise 1.4
;;; 
;;; Number of non-repeat words with n letters is @@\binom{26}{n}n!@@.
;;; Number of non-repeat-words is @@\sum_{n=1..26} n!@@
;; **

;; @@
(defn nonrepeat [n] (* (choose 26 n) (factorial n)))
(def a (apply + (map nonrepeat (range 1 27))))
a
(/ (nonrepeat 26) a)
(/ 1 Math/E)

;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-double'>0.36787944117144233</span>","value":"0.36787944117144233"}
;; <=

;; @@

;; @@
