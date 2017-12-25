import java.io.FileNotFoundException

object TaskCSV {


  def readFile(): Unit =
  {
    var bufferedSource: io.Source = null
    //var vectorCSV: Vector[CSVLine] = new Vector()


    try {
     bufferedSource = io.Source.fromFile("/Users/jakubkrymarys/IdeaProjects/ZPOlabs11/src/wydatki.csv")
        }

    catch {
      case e: FileNotFoundException => println("File Not Found Exception"); System.exit(1)
  }

    for (line <- bufferedSource.getLines.drop(0)) {
      var col = line.split(",").map(_.trim)

      print(line)

      try {
        new CSVLine(col(0), Math.round(col(1).toDouble).toInt, Math.round(col(2).toDouble).toInt, Math.round(col(3).toDouble).toInt)
      } catch {
        case e: NumberFormatException => println("Number Format Exception"); System.exit(1)
        case e: Exception => println(e.getMessage); System.exit(1)
      }


    }
    bufferedSource.close
  }

  def main(args: Array[String]) : Unit =
  {
    readFile()
  }
}

class CSVLine(month: String, income: Int, outcome: Int, difference: Int)
{ }
