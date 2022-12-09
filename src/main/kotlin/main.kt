fun main() {
    var likes: Int = 1011
    var result: String = "Понравилось $likes "
    if (likes % 10 == 1 && likes % 100 != 11) {
        result += "человеку"
    } else{
        result += "людям"
    }
    println(result)
}