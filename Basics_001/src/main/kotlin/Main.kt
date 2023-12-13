fun main(args: Array<String>) {

    //VARIABLES

    //readonly variable
    val ourFirstVariable: Boolean = true
    //read and write variable
    var ourSecondVariable: Boolean = false


    //NUMERIC DATA TYPES

    //ints ins kotlin are 32bits
    val anotherInt: Int = 0
    var anotherIntB: Int = 0

    //byte is 8bits
    val aByte: Byte = 0

    //a short which is 16bits
    val aShort: Short = 0

    // a long is 64bits
    val aLong: Long = 0
    var anotherLong = 21L

    // A double is 64bit
    val aDouble: Double = 5.5

    // A float is 32bit
    val aFloat: Float = 5.5F

    println(aFloat.toInt())


    // CHARS AND STRINGS

    val aChar:Char = 'a'
    val newLineChar:Char = '\n'
    val helloNew: String = "Hello World"
    val raw = """
        some
        multiline
        string
    """.trimIndent()

    println(raw)

    //NULLABLE TYPES
    var nullType: String? = null

    //returns an exception if  the value is null
    println(nullType!!.length)

    //prints null
    println(nullType?.length)

    nullType = "Kero Kero"
    println(nullType.length)
}