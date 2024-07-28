package datastructure.linear.queue

import java.util.PriorityQueue


fun main(){
    //Create
    val queue = Queue<Int>()
    val priorityQueue = PriorityQueue<Int>()

    //Insert
    queue.enqueue(12)
    queue.enqueue(8)
    queue.enqueue(2)

    priorityQueue.add(110)
    priorityQueue.add(98)
    priorityQueue.add(122)

    // Remove
    queue.deque()
//    queue.clear()

    priorityQueue.poll()
//    priorityQueue.clear()


    //Search
    val peaked = queue.peek()
    val priorityPeaked = priorityQueue.peek()

    println(queue)
    println(peaked)

    println(priorityQueue)
    println(priorityPeaked)
}