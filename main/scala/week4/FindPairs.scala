package week4

import scala.collection.immutable.HashSet
import scala.math.abs

object FindPairs extends App {
  def findPairs(nums: Array[Int], k: Int): Int ={
    val sorted = nums.sorted
    val set = scala.collection.mutable.HashSet[(Int, Int)]()
    for(i<-0 until sorted.length){
      for (j<-i until sorted.length){
        if (i!=j && sorted(j)-sorted(i)==k)
          set+=sorted(i)->sorted(j)
      }
    }
    set.size
  }

  println(findPairs(Array(3, 1, 4, 1, 5),2))
  println(findPairs(Array(1, 2, 3, 4, 5),1))
  println(findPairs(Array(1, 3, 1, 5, 4),0))

}
