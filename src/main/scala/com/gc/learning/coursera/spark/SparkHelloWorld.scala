package com.gc.learning.coursera.spark

import org.apache.spark.sql.SparkSession

object SparkHelloWorld {
  def main(args: Array[String]): Unit = {

//    println("Hello World")

    val spark = SparkSession.builder()
      .master("local")
      .appName("Hello World")
      .getOrCreate()

    val messages = Seq("Hello","World")

    val messagesRdd = spark.sparkContext.parallelize(messages)

    // print messages

    messagesRdd.collect().foreach(println)


  }
}
