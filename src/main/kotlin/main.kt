fun main() {
    var likes: Int = 162
    var result: String = "Понравилось $likes "
    if (likes % 10 == 1) {
        result += "человеку"
    } else{
        result += "людям"
    }
    println(result)
}