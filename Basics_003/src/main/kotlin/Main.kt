enum class Bit {
    RED, GREEN, BLUE
}

fun getMessage(input: Int): String = if (input > 3) "Hello" else "Nope"

fun getMessageWith(input: Bit) = when (input) {
    Bit.BLUE -> "blue"
    Bit.GREEN -> "green"
    Bit.RED -> "red"
}

fun main(args: Array<String>) {
    val someVariable = 8
    if (someVariable < 1) {
        println("Hello Retards!")
    } else if (someVariable == 2) {
        println("Something Awesome")
    } else {
        println("NO")
    }

    println(getMessageWith(Bit.BLUE))

    //When {Same As Case in Other Languages}
    when {
        someVariable > 3 -> println("Variable was Greater than 3")
        someVariable == 3 -> println("Variable is 3")
        else -> {
            println("Error Found")
        }
    }


    //short When

    when (someVariable) {
        2, 3 -> println("The Value is 2 or 3")
        in 4..Int.MAX_VALUE -> println("Value is from 4-10")
    }

    // A statement doesn't return any value
    // an Expression has it's value returned from a function or used as a variable

    //EXPRESSION
    val message = if (someVariable > 3) {
        "The value is greater than 3"
    } else {
        "The value is not greater than 3"
    }

    println(message)

    //TRY CATCH
    val message_01 = try {
        "the values is ${10 / 0}"
    } catch (error: Throwable) {
        println("${error}")
    }
    println(message_01)


    // SMART CASTING

    var aGeneral: Any = 5
    var menTal: Int = aGeneral as Int


    //FOR LOOPS

    for (i in 0 until 5) {
        println(i)
    }



    for (i in 10 downTo 5 step 2) {
        println(i)
    }
}
