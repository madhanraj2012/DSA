package datastructure.linear.stack

fun main(){

    // Create
    val stack = Stack<Int>()

    //Insert
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)

    //Remove
    stack.pop()
//    stack.clear()

    //Search
    val last = stack.peek()

    println(stack)
    println(stack.size())
    println(last)

}