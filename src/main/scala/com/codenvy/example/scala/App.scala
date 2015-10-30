package com.codenvy.example.scala

import org.apache.spark.{SparkContext, SparkConf}

object SparkMeApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkMe Application")
    val sc = new SparkContext(conf)

    val fileName = args(0)
    val lines = sc.textFile("sample.txt").cache()

    val c = lines.count()
    println(s"There are $c lines in $fileName")
    println("2")
    
  }
}