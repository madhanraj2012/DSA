package datastructure.linear.linkedlist

import java.util.LinkedList

class DoublyLinkedList<T:  Comparable<T>> {

    private val linkedList = LinkedList<T>()

    fun addFirst(value: T){
        linkedList.addFirst(value)
    }

    fun addLast(value: T){
        linkedList.addLast(value)
    }

    fun removeFirst(): T?{
        return linkedList.removeFirst()
    }

    fun removeLast(): T?{
        return linkedList.removeLast()
    }

    fun remove(value: T): Boolean{
        return linkedList.remove(value)
    }

    fun removeAt(index: Int): T {
        return linkedList.removeAt(index)
    }

    fun peekFirst(): T?{
        return linkedList.peekFirst()
    }

    fun peekLast(): T?{
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