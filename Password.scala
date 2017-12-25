
class Password() {


  def checkMinLenth(min: Int) (str : String): Boolean =  str.length >= min

  def checkMaxLenth(max: Int) ( str : String): Boolean =  str.length <= max

  def hasCapitalLetter(str: String) : Boolean =   str == str.toLowerCase()

  def hasLowerCaseLetter(str: String) : Boolean = str == str.toUpperCase()

  def hasNumbers(numNumbers : Int )(str: String) : Boolean =  str.filter(char => char.isDigit).length() >= numNumbers


}
