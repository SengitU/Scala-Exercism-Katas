object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    var currentNumber: Int = 0
    var sumOfAll = 0

    for(currentNumber <- 1 until limit) {
      val isMultiplier = factors.find((factor: Int) => (currentNumber % factor) == 0)
      
      if(isMultiplier ne None) {
        sumOfAll += currentNumber
      }
    }

    return sumOfAll
  }
}

