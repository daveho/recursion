(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))))

(defn singleton? [coll]
  (= (count coll) 1))

(defn my-last [coll]
  (cond
    (empty? coll) nil
    (singleton? coll) (first coll)
    :else (my-last (rest coll))))

(defn max-element [a-seq]
  (cond
    (empty? a-seq) nil
    (singleton? a-seq) (first a-seq)
    :else (max (first a-seq) (max-element (rest a-seq)))))

(defn seq-max [seq-1 seq-2]
  (let [len1 (count seq-1)
        len2 (count seq-2)]
    (if (> len1 len2)
      seq-1
      seq-2)))

(defn longest-sequence [a-seq]
  (cond
    (empty? a-seq) nil
    (singleton? a-seq) (first a-seq)
    :else (seq-max (first a-seq) (longest-sequence (rest a-seq)))))

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (let [head (first a-seq)
          tail (rest a-seq)]
      (if (pred? head)
        (cons head (my-filter pred? tail))
        (my-filter pred? tail)))))

(defn sequence-contains? [elem a-seq]
  (cond
    (empty? a-seq) false
    (= (first a-seq) elem) true
    :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (cond
    (empty? a-seq) a-seq
    (pred? (first a-seq)) (cons (first a-seq) (my-take-while pred? (rest a-seq)))
    :else []))

(defn my-drop-while [pred? a-seq]
  (cond
    (empty? a-seq) a-seq
    (pred? (first a-seq)) (my-drop-while pred? (rest a-seq))
    :else a-seq))

(defn seq= [a-seq b-seq]
  (cond
    (empty? a-seq) (empty? b-seq)
    (empty? b-seq) false
    (not (= (first a-seq) (first b-seq))) false
    :else (seq= (rest a-seq) (rest b-seq))))

(defn my-map [f seq-1 seq-2]
  [:-])

(defn power [n k]
  :-)

(defn fib [n]
  :-)

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

