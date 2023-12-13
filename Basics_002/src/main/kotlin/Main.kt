//global function - [function declared outside another function]
fun printGreeting(name: String = "World"): String = "Hello $name"

var greetingFunction: (String) -> String = { greeting ->
    "Help! Retard $greeting"
}

fun calculateValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println("The value is ${calculator(value1, value2)}")
}

fun main(args: Array<String>) {
    calculateValue(2, 2) { value1, value2 ->
        value1 + value2
    }
    //local function - [function declared inside another function]
    fun getGreeting(): String {
        return "Hello Kotlin"
    }
    println(getGreeting())

    println(printGreeting())

    println(greetingFunction("Alert"))

    greetingFunction = { newGreeting ->
        "Retard Alert $newGreeting"
    }

    println(greetingFunction("Class"))
}