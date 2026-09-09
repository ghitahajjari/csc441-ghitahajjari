package week3wed

fun main() {
    println("---Step 1 - main and output")
    println("csc 441")
    println("kotlin, first day")

    println("---Step 2 - val and var")
    val course = "CSC 441"
    var weakNumber = 3
    weakNumber += 1

    println(course)
    println(weakNumber)

    println("---Step 3 - The four basic types")
    val name = "Ghita"
    val age: Int = 20
    val gpa = 3.75
    val teaching = false

    println(name)
    println(age)
    println(gpa)
    println(teaching)

    println("---Step 4 - String templates")
    println("$name is learning $course ")
//    println(name + " " + "learns" + " " + course)
//    println(name + " learns " + course)
    println("Next year: ${age + 1}")
    println("name length: ${name.length}")

    println("---Step 5 - Reading input")
    print("What is your name? ")
    val yourName = readlnOrNull()
    println("Hello, $yourName")

}