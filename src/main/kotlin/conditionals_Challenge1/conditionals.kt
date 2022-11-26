package conditionals_Challenge1

import java.util.*


fun main(args: Array<String>) {
    var random = Random().nextInt(50)+1

    when(random){
        in 1..10 -> println("Random number is between 1 and 10 because it is $random")
        in 11..20 -> println("Random number is between 1 and 20 because it is $random")
        in 21..30 -> println("Random number is between 1 and 30 because it is $random")
        in 31..40 -> println("Random number is between 1 and 40 because it is $random")
        in 41..50 -> println("Random number is between 1 and 50 because it is $random")
        else -> println("Random number is not between 1 and 50")
    }
}