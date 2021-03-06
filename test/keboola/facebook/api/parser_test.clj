(ns keboola.facebook.api.parser-test
  (:require [keboola.facebook.api.parser :as sut]
            [clojure.test :refer :all]
            [clojure.spec :as s]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.properties :as prop]))


(deftest test-unfold-nested-sequence
  (is (test-and-check `sut/unfold-nested-sequence 20)))

(deftest test-get-columns
  (is (test-and-check `sut/get-columns 20)))

(deftest test-analyze
  (is (test-and-check `sut/analyze 20)))

(deftest test-analyze-seq
  (is (test-and-check `sut/analyze-seq 20)))

#_(defspec test-unfold-nested-sequence 4
  (prop/for-all [coll table-data-gen]
                (let [test-value (sut/unfold-nested-sequence coll)]
                  (and
                     (not (reduced? test-value))
                     (every? map? test-value)))))

#_(defn foo-test [x]  x)
#_(s/fdef foo-test :args (s/cat :x some?) :ret some?)
