import org.junit.jupiter.api.Test

class minimumValue {

    @Test
    fun `returns the minimum value of the array`(){
        val array = arrayOf(5,7,3,2,6,8,1,0)
        val min = minValue(array)
        assert(min == 0)
    }
}