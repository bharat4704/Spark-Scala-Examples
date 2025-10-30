package com.bharatbhojwani.spark.examples.dataset.dataframe.examples

import org.apache.spark.sql.SparkSession

object DataFrameEmptyCheck extends App {

  val spark:SparkSession = SparkSession.builder()
    .master("local[1]")
    .appName("Bharat")
    .getOrCreate()

  val df = spark.emptyDataFrame

  println(df.isEmpty)
  println(df.rdd.isEmpty())
  println(df.head())
  println()
}
