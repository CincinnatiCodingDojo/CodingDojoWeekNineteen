(ns sudoku.core
  (:gen-class)
  (:require [clojure.set :refer :all]))


(defn multiples-of-n [multiple ceiling]
  (range multiple (+ 1 ceiling) multiple)
  )

(defn multiples-of-three [ceiling]
  (multiples-of-n 3 ceiling)
)

(defn multiples-of-five [ceiling]
  (multiples-of-n 5 ceiling)
)

(defn multiples-of-three-and-five [ceiling]
  (set
    (distinct (concat (multiples-of-three ceiling) (multiples-of-five ceiling)))
    )
  )

(defn sum-of-multiples [ceiling]
  (reduce + (multiples-of-three-and-five ceiling))
  )
