package collections

fun main(args: Array<String>) {


    //<editor-fold desc="Arrays">
    // ** ARRAYS **
    val array = arrayOf("Texas", "Iowa", "California") // Mutable
    val states = arrayOf("Nevada", "Florida")
    val mixed = arrayOf("Kotlin", 17, 3.0, false)  // Arrays can hold different types of variables
    val numbers = intArrayOf(1,2,3,4,5) // Specifies which type of variables can an array hold
    print("\n"+mixed[0]) // "Kotlin"

    mixed[2] = 3.1415 // Changing mixed variable at 2nd element (3.0) to new value 3.1415
    print("\n"+mixed[2]) // Printing mixed second element

    val allStates = array + states // Combines 2 arrays of same type (string)

    print("\nTotal number of states is " + allStates.size)

    val empty: Boolean = numbers.isEmpty()

    if(states.contains("Kentucky")){
        print("\nStates do contain Kentucky")
    }
    else print("\nStates do not contain Kentucky")
    //</editor-fold>

    //<editor-fold desc="Lists">
    // ** LISTS **
    val arrayNamesList = arrayListOf("Orange", "Apple", "Banana")
    val list = arrayListOf("Peter")
    println(arrayNamesList[0]) // Prints Orange
    println(arrayNamesList + list) // Prints both namesList & list elements
    println(arrayNamesList.size) // Prints the size of arrayNamesList (3)
    println(arrayNamesList.isEmpty()) // False
    print(arrayNamesList.contains("Sarah")) // False

    arrayNamesList.add("Josh") // Adds Josh
    print(arrayNamesList)
    arrayNamesList.add(1,"Goran")
    print(arrayNamesList)

    val sublist = arrayNamesList.subList(1,2)
    print("\nSublist is containing: $sublist")
    //</editor-fold>

    //<editor-fold desc="ArrayLists">
    // ** ARRAYLISTS **

    val arrayList = arrayListOf("Patrick", "Michael", "Sarah") // Combines Array + List, has .add method
    arrayList.add("Sandra") // Adds a new element of an arrayList
    arrayList.add("Ivana")

    if(arrayList.contains("Ivana")){
        print("\nNames list does contain Ivana")
    }
    else print("\nNames list does not contain Ivana")

    print("\n"+arrayList) // Prints the whole arrayList
    //</editor-fold>
}