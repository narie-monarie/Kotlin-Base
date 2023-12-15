fun minValue(nums: Array<Int>):Int{
    var minVal = 5001
    for(n in nums){
        if(n < minVal){
            minVal = n
        }
    }
    return minVal
}
fun main(args: Array<String>) {
    val nums = arrayOf(3, 4, 5, 1, 2)
    println(minValue(nums))
}