package datastructure.linear.linkedlist

fun main() {
    //Create
    val singly = SinglyLinkedList<Int>()
    val doubly = DoublyLinkedList<Int>()

    //Insert/ Update
    singly.add(22)
    singly.add(1)
    singly.add(11)
    singly.add(8)

    doubly.addFirst(22)
    doubly.addFirst(1)
    doubly.addLast(8)
    doubly.addLast(11)

    singly[0] = 9
    doubly[1] = 9


    //Remove
    singly.remove() // removes first item
    doubly.removeFirst() // removes first item
    doubly.removeLast() // removes first item
//    list.remove(12)
//    list.removeAt(0)

    //Search
    val exist = singly.contains(1)
    val first = singly.peek()

    val doublyFirst = doubly.peekFirst()


    //Sort
    singly.sort() // in case original list needs to be modified
    val sorted = singly.sorted() //in case original list should be immutable

    println(singly)
    println(sorted)
    println(exist)
    println(first)
    println(singly.size())

    println(doubly)
    println(doublyFirst)
    println(doubly.size())

}