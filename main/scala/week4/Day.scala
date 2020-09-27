package week4

object Day extends App{
  def dayOfTheWeek(day: Int, month: Int, year: Int): String = {
    val isLeapYear = (year: Int) =>
      (((year % 4) == 0) && !(
        ((year % 100) == 0) &&
          !((year % 400) == 0))
        )
    val weekDays = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    val months = Array(0, 31,28,31,30,31,30,31,31,30,31,30,31)
    var days = 4
    for (i <- 1971 until year) days += (if (isLeapYear(i)) 366 else 365)
    for (i<-1 until month){
      if (i==2 && isLeapYear(year)) days+=1
      days+=months(i)
    }
    days+=day
    weekDays(days%7)
  }

  println(dayOfTheWeek(31, 8, 2019))

}
