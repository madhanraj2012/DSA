package algorithm.linear.search

fun main(){
    val array = intArrayOf(0, 1, 2, 3, 4, 5)
    val strings = listOf("Apple", "Microsoft", "Google", "Meta")
    val chars = listOf('A', 'B', 'C', 'D')
    val maps = mapOf(0 to 'A', 1 to 'B',2 to 'C', 3 to 'D')

    for (number in array){
        println(number)
    }

    for (i in strings.indices){
        println(strings[i])
    }

    chars.forEach { char ->
        println(char)
    }

    chars.forEachIndexed { index, c ->
        println(c)
    }

    for ((key, value) in maps){
        println("key is $key value is $value" )
    }

}