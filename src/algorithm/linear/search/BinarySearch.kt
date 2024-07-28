package algorithm.linear.search

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val indexOf4 = binarySearch(list ,4)
    println(indexOf4)

    val indexOf8 = binarySearch(list, 8)
    println(indexOf8)


    val indexOf11 = binarySearch(list, 11)
    println(indexOf11)

    //Internal Binary Search
    val internalMethod = list.binarySearch(2)
    println(internalMethod)
}

fun binarySearch(list: List<Int>, element: Int) : Int{
    var left = 0
    var right = list.size - 1

    while (left <= right){
        val mid = left + (right - left) / 2

        when{
            list[mid] > element -> right =  mid - 1
            list[mid] < element -> left = mid + 1
            else -> return mid
        }
    }
    return  -1
}