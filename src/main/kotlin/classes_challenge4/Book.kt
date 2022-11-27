package classes_challenge4
//Challenge: Classes
//Create a class representing a book. Every book has a title, an author, a publication year and is either borrowed or not.
// Choose an appropriate data type for each of these properties.
//A book can be borrowed from you or returned to you. In both cases, the borrowed property is updated accordingly.
// Also, a book should be able to print itself to the command line, including its title, author, and publication year.

class Book(val title: String, val author: String, val publicationYear: Int, var isBorrowed: Boolean) {

    init {
        println("Object "+ this.title +" was created")
    }

    fun borrow() : Boolean{
        if(isBorrowed){
            println("You cannot borrow a book that's already borrowed.")
        }
        else{
            println("You have borrowed the book!")
            isBorrowed = true
        }
        return isBorrowed
    }

    fun returnBook() : Boolean{
        if(!isBorrowed){
            println("You cannot return a book that's already returned.")
        }
        else{
            println("You have returned the book!")
            isBorrowed = false
        }
        return isBorrowed
    }

    fun printBook(){
        println(this.title)
        println(this.author)
        println(this.publicationYear)
        println("Borrowed? "+this.isBorrowed)
    }
}

fun main() {
    val firstBook = Book("Java","Inaru",1975,false)
    //val secondBook = Book("Kotlin","Hatai",1992,true)
    firstBook.returnBook() // False
    firstBook.borrow() // Becomes True
    println("Borrow value:  "+firstBook.isBorrowed)
    firstBook.borrow() // Cant borrow again
    firstBook.returnBook() // returning the book
    firstBook.printBook() //

}

