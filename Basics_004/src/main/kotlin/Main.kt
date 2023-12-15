fun main(args: Array<String>) {

    //Initializing Arrays
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    var riversArrayIndex = riversArray[0]
    riversArray[0] = "Mississippi"

    // Look for min Value Problem
    var nums = arrayOf<Int>(3, 4, 5, 1, 2)
    var minVal = 50001

    var nn = intArrayOf(1,2,3,4)
    var xx = intArrayOf(nn.indexOf(2), nn.indexOf(1))
    xx.forEach { println(it) }

    println(nn.indexOf(2))
    //Looping over arrays
    for(n in nums){
        if(n < minVal) {
            minVal = n
        }
    }
   /* println(minVal) */


    for (i in riversArray){
     /*   println(i) */
    }

    var n = intArrayOf(1,2,3,4)

    for(i in 0 until n.size){
        /* println(i) */
    }

    //n.forEach { element -> print(element) }

    //println()

    val doubleValues = List<Int>(5){index-> 2*index}
    //doubleValues.forEach{ print(it) }

    val emptyListString = emptyList<String>()
    val languages = mutableListOf("Java","C++","Python")

    println()

    // SETS and MAPS

    val numbers:MutableSet<Int> = mutableSetOf(1,1,2,3,4,4)

    numbers.forEach{nums->
      //  println(nums)
    }


    //MAPS

    val numbersMap = mutableMapOf("key1" to 12, "key2" to 11)
    numbersMap.forEach { key, value -> println(value) }
    //if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    //if (1 in numbersMap.values) println("The value 1 is in the map")
    //if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    val c = mutableMapOf<Int,Int>()
    c[0] = 1

    //c.forEach { i, v -> println(i) }


    val ls = sequenceOf("Java","C++","Kotlin").filter { it.length > 2 }.map { it }.forEach { println(it) }


    //COMMAND LINE ARGUEMENTS

    print("what is your name? ")

    // ?: Elvis operator means that we cannot pass an empty file which will be  discarded

    val newName = readLine() ?: ""
    println("The name is $newName")

}