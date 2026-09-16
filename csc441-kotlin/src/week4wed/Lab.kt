package week4wed
fun main(){
    println("Step 1 -- Description")
    describeToday()

    println("Step 2 -- Favourite thing")
    println(favouriteThing())

    println("Step 3 -- One number")
    println(pickOne(4))

    println("Step 4 -- One number short")
    println(pickOneShort(10))

    println("Step 5 -- One number Default")
    println(pickWithDefault(name = "Ghita"))
    println(pickWithDefault())


}

fun describeToday(){
    println("Describing nothing")
}

fun favouriteThing(): String{
    return "My favourite thing is math"
}

fun pickOne(number: Int): String{
    return when(number){
        1 -> "A"
        2 -> "B"
        3 -> "C"
        4 -> "D"
        5 -> "E"
        else -> "NO!"
    }
}

fun pickOneShort(number: Int): String = when(number){
    1 -> "A"
    2 -> "B"
    3 -> "C"
    4 -> "D"
    5 -> "E"
    else -> "NO!"
}

fun pickWithDefault(number: Int = 1, name: String = "you"): String{
    val numero = when (number){
        1 -> "A"
        2 -> "B"
        3 -> "C"
        4 -> "D"
        5 -> "E"
        else -> "NO!"
    }
    return "$name is $numero"
}
