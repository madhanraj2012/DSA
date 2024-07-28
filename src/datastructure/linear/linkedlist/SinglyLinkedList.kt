package datastructure.linear.linkedlist

import java.util.LinkedList

class SinglyLinkedList<T:  Comparable<T>> {

    private val linkedList = LinkedList<T>()

    fun add(value: T){
        linkedList.addLast(value)
    }

    fun remove(): T?{
        return linkedList.removeFirst()
    }

    fun remove(value: T): Boolean{
        return linkedList.remove(value)
    }

    fun removeAt(index: Int): T {
        return linkedList.removeAt(index)
    }

    fun peek(): T?{
        return linkedList.peekFirst()
    }

    operator fun set(index: Int, value: T) {
        linkedList[index] = value
    }

    fun sort(){
        linkedList.sort()
    }

    fun sorted(): List<T>{
        return linkedList.sorted()
    }

    fun contains(value: T): Boolean{
        return linkedList.contains(value)
    }

    fun size(): Int{
        return linkedList.size
    }

    override fun toString(): String {
        return linkedList.joinToString()
    }
}