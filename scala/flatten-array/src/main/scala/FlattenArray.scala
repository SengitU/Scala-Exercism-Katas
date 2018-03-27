import scala.collection.mutable.ListBuffer

object FlattenArray {
  def flatten(arrayToBeFlatten: List[Any]): List[Any] = {
    var flattenedArray = ListBuffer[Any]()

    arrayToBeFlatten foreach {
      case list: List[Any] =>
        flattenedArray ++= list
      case item =>
        flattenedArray += item
    }

    val isFlattened = arrayToBeFlatten find { _.isInstanceOf[List[Any]]}

    if(isFlattened.isEmpty) arrayToBeFlatten
    else flatten(flattenedArray toList)
  }
}
