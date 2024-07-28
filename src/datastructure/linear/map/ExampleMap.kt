package datastructure.linear.map

import java.util.LinkedHashMap
import java.util.TreeMap
import java.util.concurrent.ConcurrentHashMap

fun main(){

    // Create
    val map = mutableMapOf(0 to "Apple", 1 to "Banana")
    val map1 = mutableMapOf<Int, String>()

    val map2 = mapOf(0 to "Apple", 1 to "Banana")

    val map3 = hashMapOf<Int, String>()
    val map4 = hashMapOf(0 to "Apple", 1 to "Banana")

    val map5 = linkedMapOf<Int, String>()
    val map6 = linkedMapOf(0 to "Apple", 1 to "Banana")

    val map7 = TreeMap<Int, String>()
    val map8 = ConcurrentHashMap<Int, String>() // optimised for concurrency in multi thread

    //Insert
    map[0] = "Ant"

    // Update (Immutable map cannot be updated)
    map1[0] = "Apple"


    // Read
    val mapValue = map[0]

    // Sort
    //TreeMap is sorted in nature (increases in time complexity 0(log n))

    for ((key, value) in map){
        println("map $key $value")
    }

    for ((key, value) in map1){
        println("map1 $key $value")
    }
}