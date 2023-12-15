fun isMonotonic(nums:Array<Int>):Boolean{
    if (nums[0] > nums[1]){
        nums.reverse()
    }

    for (i in 0 until nums.size-1){
        if (!(nums[i] > nums[i+1])){
            return false
        }
    }
    return true
}
fun main(args: Array<String>) {
    println( isMonotonic(arrayOf(1,3,2)))
}