object Max extends App{
  def maxProduct(nums: Array[Int]): Int = {
    val sorted = nums.sorted
    val max1 = sorted(sorted.length-1)
    val max2 = sorted(sorted.length-2)
    val result = (max1 - 1)*(max2-1)
    result
  }
  println(maxProduct(Array(3,4,5,2)))
  println(maxProduct(Array(1,5,4,5)))
  println(maxProduct(Array(3,7)))
}