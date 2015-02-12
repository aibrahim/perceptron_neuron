(ns perceptrons.nand_gate
  (:use perceptrons.compute))

(defn print_table 
  "print pretty table for NAND gate."
  [inputs outputs]
  (println "---------------")
  (println "  NAND GATE  ")
  (println "---------------")
  (println " x | y | output")
  (println "---------------")
  (doseq [[[x y] o] (map list inputs outputs)]
    (println (format " %s | %s | %3d" x y o)))
  (println "---------------"))

(defn simulate_nand_gate
  "NAND GATE using perceptron."
  []
  (let [inputs [[0 0] [0 1] [1 0] [1 1]]
        outputs (map #(apply compute_perceptron %) inputs)]
    (print_table inputs outputs)
  )
)
