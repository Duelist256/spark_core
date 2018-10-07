package first

import org.apache.spark.sql.SparkSession

object Ex_1_RDD_Intro {
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    val spark = SparkSession.builder()
      .master("local[2]")
      .appName("RDD_Intro")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    val sc = spark.sparkContext

    val codeRows = sc.parallelize(Seq(("Ivan", 250), ("Elena", -15), ("Petya", 50), ("Elena", 290)))
    codeRows.reduceByKey(_ + _).collect().foreach(println)

    codeRows.groupByKey().collect().foreach(println)

  }
}
