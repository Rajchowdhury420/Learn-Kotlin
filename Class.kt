class Student {
 
    fun printResult() 
    {
        println("Printing student result")
    }
 
    fun expel() 
    {
        println("Expelling student from school")
    }
}
 
fun Student.printResult() {
    println("Extension function printResult()")
}
 
fun Student.expel(reason: String) {
    println("Expelling student from School. Reason: \"$reason\"")
}


// Happy Coding !!!
