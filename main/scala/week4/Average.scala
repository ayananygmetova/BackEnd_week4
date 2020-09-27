package week4

import scala.collection.mutable.ArrayBuffer

object Average extends App{
  def average(salary: Array[Int]): Double = {
    val min = salary.min
    val max = salary.max
    val new_arr:ArrayBuffer[Int] = salary.filter(_!=min).filter(_!=max).to(ArrayBuffer)
    val average = (new_arr.sum.toDouble / new_arr.length)
    average
  }
//  println(average(Array(4000,3000,1000,2000)))
  println(average(Array(48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000)))
//  println(average(Array(6000,5000,4000,3000,2000,1000)))
//  println(average(Array(8000,9000,2000,3000,6000,1000)))

}
