(ns sudoku.core-test
  (:require [midje.sweet :refer :all]
            [sudoku.core :refer :all]))


  (fact "Should find multiples of 3 under n"
    (multiples-of-three 10) => [3,6,9]
    (multiples-of-three 20) => [3,6,9, 12, 15, 18]
    (multiples-of-three 30) => [3,6,9,12,15,18,21,24,27,30]

  )
 (fact "Should find multiples of 5 under n"
    (multiples-of-five 10) => [5,10]
    (multiples-of-five 20) => [5,10,15,20]
  )

 (fact "Should find multiples of n under n"
    (multiples-of-n 3 10) => [3,6,9]
  )

 (fact "Should find multiples of 3 and 5 under n"
    (multiples-of-three-and-five 10) => #{3 5 6 9 10}
  )

 (fact "should sum the multiples of 3 and 5 under n"
   (sum-of-multiples 10) => 33
  )



; (fact "first-of-column should return the top cell index"
;   (first-of-column 0) => 0
;   (first-of-column 1) => 1
;   (first-of-column 40) => 4
;   (first-of-column 80) => 8)

; (fact "column-peers should return all indices of the column"
;   (column-peers 40) => #{4 13 22 31 49 58 67 76})


; (fact "first-of-row should return the left row index"
;   (first-of-row 0) => 0
;   (first-of-row 13) => 9
;   (first-of-row 40) => 36
;   (first-of-row 80) => 72)

; (fact "row-peers should return all indexes of the row besides itself"
;   (row-peers 7) => #{0 1 2 3 4 5 6 8})

; (fact "first-of-region should return the index of the top-left cell of the region"
;   (first-of-region 13) => 3
;   (first-of-region 47) => 27
; )

; (fact "get-group-row-index returns zero 27 or 54 based on your index"
;   (get-group-row-index 13 ) => 0
;   (get-group-row-index 40 ) => 27)

; (fact "region-peers should return the indicies of the cells in the region"
;   (region-peers 40 ) => #{30 31 32 39 41 48 49 50}
;   (region-peers 26 ) => #{ 6  7  8 15 16 17 24 25}
;   )
