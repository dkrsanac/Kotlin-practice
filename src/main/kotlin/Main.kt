
import androidx.compose.ui.window.application
import java.lang.Math.random
import java.util.*


fun main() = application {
    var random = Random().nextInt(50)+1
    when(random){
        in 1..10-> print("Random number is between 1 and 10")
        in 11..20 -> print("Random number is between 11 and 20")
        in 21..30 -> print("Random number is between 21 and 30")
        in 31..40 -> print("Random number is between 31 and 40")
        in 41..50 -> print("Random number is between 41 and 50")
        else -> { print("Random number is not between 1 and 50")}
    }

}
