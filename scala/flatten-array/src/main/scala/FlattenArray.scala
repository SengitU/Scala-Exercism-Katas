import scala.collection.mutable.ListBuffer

object FlattenArray {
  def flatten(arrayToBeFlatten: List[Any]): List[Any] = {
    var flattenedArray = ListBuffer[Any]()

    arrayToBeFlatten foreach {
      case list: List[Any] =>
        flattenedArray ++= list
      case number: Int =>
        flattenedArray += number
      case _ =>
    }

    val isFlattened = flattenedArray find { _.isInstanceOf[List[Any]]}

    if(isFlattened.isEmpty) flattenedArray filter { _ != null} toList
    else flatten(flattenedArray toList)
  }
}
