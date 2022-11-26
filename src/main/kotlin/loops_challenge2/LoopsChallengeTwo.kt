package loops_challenge2

// Task -> Calculate a sum from all numbers between 100 and 100 000


fun calculateSum(): Long {
    var sum: Long = 0
    for (iterator in 100..100000) {
        sum += iterator
       // println(sum)
    }
    return sum
}

fun main() {
    val sum: Long = calculateSum()
    println("Total sum of all numbers between 100 and 100 000 is $sum")
}