import Math.pow

package codewars {
  object Kata {
    def boolToWord(boolean: Boolean): String = {
      if (boolean) "Yes" else "No"
    }

    def numberOfPeopleInBus(busStops: List[(Int, Int)]): Int = {
      busStops.map(people => people._1).sum - busStops.map(people => people._2).sum
    }

    def pillars(number: Int, distance: Int, width: Int): Int = {
      if (number == 1) 0 else (distance * 100) * (number - 1) + width * (number - 2)
    }

    def squareSum(xs: List[Int]): Int = {
      if (xs.isEmpty) 0 else xs.map(pow(_, 2)).sum.asInstanceOf[Int]
    }

    def sumTwoSmallest(numbers: List[Int]): Int = {
      numbers.min + numbers.patch(numbers.indexOf(numbers.min), Nil, 1).min
    }
  }
}
