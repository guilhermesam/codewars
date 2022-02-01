import Math.pow

package codewars {
  object Kata {
    def squareSum(xs: List[Int]): Int = {
      if (xs.isEmpty) 0 else xs.map(pow(_, 2)).sum.asInstanceOf[Int]
    }

    def boolToWord(boolean: Boolean): String = {
      if (boolean) "Yes" else "No"
    }
  }
}
