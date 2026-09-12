package week3fri

fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()


    val tripList = mutableListOf("Clothes", "Shoes", "Passport", "Toothbrush", "Computer")
    for (item in tripList) {
        println(item)
    }

    tripList.forEachIndexed { index, item ->
        println("$index is $item")
    }

    for (i in 0 until tripList.size) {
        println("$i: ${tripList[i]}")
    }

    val day = 1
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid number of days.")
    }


    val number = 39
    val threshold = if (number > 29) "Expensive" else "Cheap"
    println(threshold)
}