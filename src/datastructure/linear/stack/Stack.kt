package datastructure.linear.stack

import java.util.LinkedList

class Stack<T> {

    private val list = LinkedList<T>()

    fun push(value: T){
        list.addLast(value)
    }

    fun pop(): T? {
        return list.removeLast()
    }

    fun peek(): T?{
        return list.peekLast()
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