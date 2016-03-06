(ns demos.notifications)

(comment)

(js/alert "Before create notification.")

(js/Notification. "Hello ClojuTRE!" (clj->js {:body "It's great to be here."}))

(js/alert "After create notification.")
