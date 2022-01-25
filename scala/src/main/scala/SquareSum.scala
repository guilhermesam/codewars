import Math.pow

package codewars {
  object SquareSum {
    def squareSum(xs: List[Int]): Int = {
      if (xs.length == 0) 0 else xs.map(pow(_, 2)).reduce((x, y) => x + y).asInstanceOf[Int]
    }
  }  
}
