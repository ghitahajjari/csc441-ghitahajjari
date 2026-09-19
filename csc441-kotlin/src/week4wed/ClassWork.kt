package week4wed

fun main(){
    println("Step 1 -- Function returning nothing --")
    todaysExercise()

    println("Step 2 -- Function returning a value --")
    println(todaysExercise1())

    println("Step 3 -- A parameter --")
    println(todaysExercise2(2))
    println(todaysExercise2(9))

    println("Step 4 -- The short form --")
    println(todaysExercise3(3))

    println("Step 5 -- The default --")
    println(todaysExercise4())
    println(todaysExercise4(2))

    println("Step 6 -- Two parameters and naming them --")
    println(todaysExercise5(2, "Ghita"))
    println(todaysExercise5(name = "Sam"))


}

fun todaysExercise(){
    println("Push-ups")
}

fun todaysExercise1(): String{
    return "Push-ups"
}

fun todaysExercise2(dayNumber: Int): String{
    return when(dayNumber){
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
}

fun todaysExercise3(dayNumber: Int): String = when(dayNumber){
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Gym"
    5 -> "Cycling"
    else -> "Rest day"
}

fun todaysExercise4(dayNumber: Int = 1): String = when(dayNumber){
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Gym"
    5 -> "Cycling"
    else -> "Rest day"
}

fun todaysExercise5(dayNumber: Int = 1, name: String = "You"): String{
    val exercise = when (dayNumber){
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Gym"
        5 -> "Cycling"
        else -> "Rest day"
    }
    return "$name is $exercise"
}

