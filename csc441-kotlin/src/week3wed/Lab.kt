package week3wed

fun main() {
    val name = "Ghita"
    val major = "Computer science"
    val food = "Pizza"
    println(name)
    println(major)
    println(food)

    var coursesTaken = 6
    println("Courses taken: $coursesTaken")
    println("Courses after this one: ${coursesTaken + 1}")

    val firstString: String = "Hello, kotlin"
    val secondInteger: Int = 100
    val thirdDouble: Double = 2.0
    val forthBoolean: Boolean = true
    println("String Type: $firstString")
    println("Integer type: $secondInteger")
    println("Double type: $thirdDouble")
    println("Boolean type: $forthBoolean")

    println("$name is studying $major")
    println("The textbook was: ${secondInteger + 50} dollars")
    println("$name has ${name.length} characters")

    print("What college are you attending? ")
    val yourCollege = readln()
    println("$yourCollege has a beautiful campus.")




}