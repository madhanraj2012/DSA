package datastructure.linear.set

import java.util.TreeSet

fun main() {

    //Create
    val set1 = hashSetOf(0, 10, 12)
    val set2 = hashSetOf<Int>()
    val set3 = linkedSetOf(0, 12, 22)
    val set4 = linkedSetOf<Int>()
    val set5 = TreeSet<Int>()

    //Add
    set1.add(44)
    set1.add(10)
    set1.add(12)
    set1.add(22)
    set1.add(11)


    //Remove (Applies for all)
    set1.remove(10)
//    set1.clear()

    //Search (Applies for all)
    val exist = set1.contains(10)

    //Sort (Tree set is already sorted)
    val sorted1 = set1.sorted()


    println(set1)
    println(set5)

    println(exist)
    println(sorted1)
}