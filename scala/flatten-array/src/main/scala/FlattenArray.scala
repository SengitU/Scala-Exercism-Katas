import scala.collection.mutable.ListBuffer

object FlattenArray {
  def flatten(arrayToBeFlatten: List[Any]) = {
    var flattenedArray = ListBuffer[Any]()

    arrayToBeFlatten foreach {
      case list: List[Any] =>
        flattenedArray ++= list
      case item =>
        flattenedArray += item
    }

    flattenedArray
  }
}
