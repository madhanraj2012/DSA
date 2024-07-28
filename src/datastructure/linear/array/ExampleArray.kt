package datastructure.linear.array

fun main() {

    //Create (Applies for IntArray, BoolArray, FloatArray, DoubleArray, ByteArray, LongArray)
    // CharArray('0','1','2','3') ArrayList<Int>() arrayListOf<Int>() (Java Based)

    val example1 = charArrayOf('0','1','2','3')
    val example2 = listOf(51, 6, 43)
    val example3 = mutableListOf<Int>()

    // Insert
    example3.add(25)
    example3.add(21)
    example3.add(22)
    example3.add(29)

    //Update
    example3[0] = 41
    example3[1] = 42

    example1[0] = 's'
    example1[1] = 'a'
    example1[2] = 'd'
    example1[3] = 'p'
    example1[4] = 'o'

    //Remove (Applies only for example3)
    example3.remove(21)
    example3.removeAt(0)
//    example3.clear()

    //Search (Applies for all examples) (Showing only in-build options, other algorithms will be provided separately)
    val exist = example1.contains('m')
    val index = example1.indexOf('a')
    // Linear Search(unsorted), Binary Search(sorted), Tress(non linear)

    println(example1.contentToString())
    println(example2)
    println(example3)

    println("$exist $index")


    //sort (Showing only in-build options, other algorithms will be provided separately)
    example1.sort()
    val sorted2 = example2.sorted()
    example3.sort()
    //Merge sort, Heap Sort, Time sort, Dual-Pivot Quicksort


    println("sorted ${example1.contentToString()} ${example2} $sorted2 $example3")

}
