name := "spark_core"

scalaVersion := "2.11.12"

val sparkVersion = "2.3.2"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core",
  "org.apache.spark" %% "spark-sql"
).map(_ % sparkVersion)