package week4fri

fun main() {
    println("Requirement 1 -- Two names --")
    val birthdayMonth: String = "June"
    val birthdayDay: String? = null
    println(birthdayMonth.length)

    println("Requirement 2 -- Safe call --")
    println(birthdayDay?.length)

    println("Requirement 3 -- Elvis operator --")
    println(birthdayDay?.length ?: 0)

    println("Requirement 4 -- Let block--")
    val birthdayYear: String? = "2001"
    birthdayYear?.let {
        println("Birthday Year is: $it")
    }
    birthdayDay?.let {
        println("Birthday Day is: $it")
    }

    println("Requirement 5 -- toIntOrNull() --")
    val wrongValue = "Hello".toIntOrNull()
    println(wrongValue ?: "That wasn't a number")

    println("Requirement 6 -- List --")
    val colors = listOf("Red", "Green", "Blue", "Yellow", "Purple")
    println(colors)

    println("Requirement 7 -- Mutablelist --")
    val citiesList = mutableListOf("Paris", "Seattle", "Tokyo", "Rome", "Madrid")
    citiesList.add("Barcelona")
    citiesList.remove("Rome")
    println(citiesList)
    println("Items: ${ citiesList.size }")

    println("Requirement 8 -- List of numbers --")
    val temperatures = listOf(78, 45, 20, 66, 90)
    println(temperatures.sum())
    println(temperatures.average())
    println(temperatures.filter { it <=75 })


}





