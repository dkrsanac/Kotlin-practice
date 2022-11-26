package recap_challenge3

// Challenge 3: Create an array list of your favorite book titles. Loop over this list and, if
//the title contains the letter ‘e’, print each character of the name on a new
//line.

fun main() {
    var songs = arrayListOf<String>("Master of Puppets","Enter Sandman","Sanitarium")

    for(item in songs){
        if(item.contains('e')){
            for(char in item){
                println(char)
            }
        }
        println(" ")
    }
}