/**
  * Created by KeViNOne on 16/11/15.
  */

import org.apache.spark._

object Helloworld {
  def main(args: Array[String]): Unit = {
    val masterURI = "local[*]"
    val appName = "SparkStart"
    val sparkConf = new SparkConf().setMaster(masterURI).setAppName(appName)
    val sc = new SparkContext(sparkConf)

    val words = sc.parallelize(List("Hello", "world", "by", "KeViNOne"))
    val message = words.reduce(_ + " " + _)

    println(message)
  }
}
