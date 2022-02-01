import Math.pow

package codewars {
  object Kata {
    def boolToWord(boolean: Boolean): String = {
      /*
      * best solution:
      this solution is good enough :D
      * */
      if (boolean) "Yes" else "No"
    }

    def numberOfPeopleInBus(busStops: List[(Int, Int)]): Int = {
      /*
      * best solution:
      busStops.map{case (on, off) => on - off}.sum
      * */
      busStops.map(people => people._1).sum - busStops.map(people => people._2).sum
    }

    def pillars(number: Int, distance: Int, width: Int): Int = {
      /*
      * best solution:
      (n-1) * d * 100 + ((n-2) max 0) * w
      * */
      if (number == 1) 0 else (distance * 100) * (number - 1) + width * (number - 2)
    }

    def smallEnough(n: Seq[Int], l: Int): Boolean = {
      /*
      * best solution:
      this solution is good enough :D
      * */
      !n.exists(_ > l)
    }

    def squareSum(xs: List[Int]): Int = {
      /*
      * best solution:
      xs.map(x => x*x).sum
      * */
      if (xs.isEmpty) 0 else xs.map(pow(_, 2)).sum.asInstanceOf[Int]
    }

    def sumTwoSmallest(numbers: List[Int]): Int = {
      /*
      * best solution:
      numbers.sorted.take(2).sum
      * */
      numbers.min + numbers.patch(numbers.indexOf(numbers.min), Nil, 1).min
    }
  }
}
