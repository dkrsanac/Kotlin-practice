package collections

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    println(reverse(numbers))
}

fun reverse(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()

    for(i in 0 until list.size-1){
        result.add(list.size-1-i)
    }
    return result
}
