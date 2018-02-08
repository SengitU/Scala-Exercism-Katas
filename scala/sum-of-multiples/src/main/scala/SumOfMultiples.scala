object SumOfMultiples {
  /*
   *
   * #ofIterations is limit - 1
   *
   */
  // def sum(factors: Set[Int], limit: Int): Int = {
  //   var currentNumber: Int = 0
  //   var sumOfAll = 0
  //   var numOfIterations = 0;

  //   for(currentNumber <- 1 until limit) {
  //     val isMultiplier = factors.find((factor: Int) => (currentNumber % factor) == 0)
      
  //     if(isMultiplier ne None) {
  //       sumOfAll += currentNumber
  //     }
  //     numOfIterations += 1
  //   }
  //   println(numOfIterations)
  //   return sumOfAll
  // }

  /*
   * #ofIterations 
   * Increases by number of factors
   * Bigger factor number yields to lesser iterations
   * Limit increase usually increases iterations but not as much as the other one
   */
  def sum(factors: Set[Int], limit: Int): Int = {
    var multipliers: Set[Int] = Set(0)
    var numOfIterations = 0;

    factors.foreach((factor) => {
      var currentNumber: Int = 0
      for(currentNumber <- 1 to Math.floor(limit / factor).asInstanceOf[Int]) {
        val multiplier = currentNumber * factor
        if(multiplier != limit) {
          multipliers += multiplier
        }
        numOfIterations += 1
      }
    })

    println(numOfIterations + multipliers.size)
    return multipliers.reduceLeft(_ + _)
  }
}

