(ns perceptrons.compute
  (:use perceptrons.load_config))

(defn compute_perceptron
  "perceptron neuron must return 0 or 1 as output"
  [& inputs]
  (let [computed_value (+ (reduce + (map #(* % WEIGHT) inputs)) BIAS)]
    (if (>= computed_value 0) 1 0)))
