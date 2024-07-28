package datastructure.linear.queue

import java.util.LinkedList

class Queue<T> {

    private val list = LinkedList<T>()

    fun enqueue(value: T){
        list.addLast(value)
    }

    fun deque(): T? {
        return list.removeFirst()
    }

    fun peek(): T?{
        return list.peekFirst()
    }

    fun size(): Int{
        return list.size
    }

    fun clear(){
        list.clear()
    }

    override fun toString(): String {
        return list.joinToString()
    }
}