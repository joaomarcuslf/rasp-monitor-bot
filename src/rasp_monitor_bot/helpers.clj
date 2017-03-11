(ns rasp-monitor-bot.helpers
  (:require
		[clojure.java.io :as io]
		[clojure.string :as str])
  (:gen-class))

;; Will greet the user
(defn hello-user
  [chat]
  (str "Hello " (get chat :first_name)))

;; Format a string to number
(defn parse-int
  [s]
  (Integer. (re-find  #"\d+" s )))

;; Will give the raspberry temp as integer
(defn get-temp
  []
  (float (/ (parse-int (slurp (io/file "/sys/class/thermal/thermal_zone0/temp"))) 1000)))

;; Will format temp in celsius
(defn temp-to-celsius
  [temp]
  (str temp " ºC"))

;; Will send the gif path based on temperature
(defn gif-from-temp
	[]
	(def temp (int (get-temp)))

	(if (> temp 57)
		"hot-gif.gif"
		(if (< temp 50)
			"cold-gif.gif"
			"cool-gif.gif")))