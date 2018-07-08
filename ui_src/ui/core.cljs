(ns ui.core
  (:require [reagent.core :as reagent :refer [atom]]
            [clojure.string :as string :refer [split-lines]]))

(enable-console-print!)

(defn ui [] [:div "Omnom"])

(reagent/render
  [ui]
  (js/document.getElementById "ui"))
