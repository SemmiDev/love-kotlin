import java.util.*
import kotlin.Comparator
import kotlin.collections.HashMap
import kotlin.math.abs
import kotlin.math.round
import kotlin.math.sqrt

//fun main() {
//    // empty mutabllelist
//    val list1 = mutableListOf<Int>()
//
//    // as stack
//    val list2 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
//    val stack = mutableListOf<Int>()
//    stack.add(1)
//    stack.add(2)
//    stack.addAll(arrayOf(3, 4, 5, 6, 7, 8, 9, 10))
//    stack.last() // 10
//    stack.first() // 1
//    stack.removeLast() // 10
//    stack.removeFirst() // 1
//    stack.removeAll(arrayOf(4, 5, 6))
//    stack.removeAt(0)
//    println(stack[2])
//    stack.replaceAll { 2 }
//    stack[2] = 19
//    stack.forEach { println(it) }
//    stack.stream().filter { it % 2 == 0 }.forEach { println(it) }
//    stack.toString()
//    stack.removeIf { it % 10 == 0 }
//    stack.size
//    stack.contains(5)
//
//    // as queue
//    val queue = mutableListOf<Any>()
//    queue.add(2)
//    queue.add(true)
//    queue.add(3.4)
//    queue.add("sammidev")
//    queue[0] // 2
//    queue.remove(0) // return 2
//    queue.remove(0) // return true
//
//    // 0 0 0 0 0 elements
//    val array1 = Array<Int>(5) { 0 }
//    array1.forEach { print(it) }
//    val array2 = Array<Int>(5) { index -> index * 2 }
//    array2.forEach { print(it) }
//
//    val booleanArray = BooleanArray(5) { index -> index % 2 == 0 }
//    val booleanArrayOf = booleanArrayOf(true, false, false, true, true)
//
//    var map1 = hashMapOf<String, Int>()
//    var map2 = hashMapOf(
//            1 to "sammidev",
//            2 to "sammidev2",
//            3 to "sammidev3"
//    )
//    map1.put("sammidev 4", 4)
//    map1.put("sammidev 5", 5)
//    println(map1["sammidev 4"])
//
//    val pq = PriorityQueue<Int> { a, b ->
//        b - a
//    }
//
//    pq.offer(2)
//    pq.add(1)
//    pq.offer(3)
//    println(pq)
//    println(pq.peek()) // get 3 tapi tidak mengapus nya dari pq
//    println(pq.poll()) // get 3 dan mengapus nya dari pq
//    println(pq)
//
//    val nums = listOf(-2, 3, 4, -1, 5, -9, 10)
//    println(nums.sortedWith(absValueComparator))
//
//
//    val card1: Card = Card(1, Color.BLACK)
//    val card2: Card = Card(2, Color.BLUE)
//    println(card1.compareTo(card2))
//
//    val cards: List<Card> = listOf(
//            Card(9, Color.BLACK),
//            Card(2, Color.RED),
//            Card(5, Color.BLUE),
//            Card(20, Color.BLACK)
//    )
//    println(cards.sorted())
//
//    val names = listOf("sammidev", "dev")
//    println(names.getOrNull(2))
//    println(names.getOrElse(2) { "sammidev" })
//
//
//    val orangganteng = listOf("sammidev", "Aditya", "Aditya", "sammidev", "Aditya", "dandi", "gusnur", "ayatullah")
//    println(orangganteng.all { a -> a == "Aditya" })
//    println(orangganteng.any { a -> a == "Aditya" })
//
//
//    orangganteng.first()
//    orangganteng.firstOrNull()
//    orangganteng.last()
//    orangganteng.lastOrNull()
//    val index = orangganteng.indexOf("sammidev")
//    val lastindex = orangganteng.lastIndexOf("sammidev")
//    println(index)
//    println(lastindex)
//
//    val angkaCollection = listOf("one", "two", "three", "four")
//    angkaCollection.first { it.length > 4 }
//    angkaCollection.first { it.length > 10 }
//    val students = listOf(
//            Student(17),
//            Student(27),
//            Student(37),
//            Student(47)
//    )
//    println(students.binarySearchBy(17) { it.age })
//
//
//
//    println(abs(-23)) // 23
//    println(max(20, 10)) // 20
//    println(min(20, 10)) // 10
//    println(ceil(20.9)) // 21
//    println(floor(20.9)) // 20
//    println(round(2.5)) // 3
//    println(round(1.5)) // 2
//    println(round(1.4)) // 1
//    println(round(2.6)) // 3
//    println(sqrt(6.25)) // akar kuadrat
//
////    constant
//    var maxValue = Int.MAX_VALUE
//    var minValue = Int.MIN_VALUE
////    maxValue = Long.MAX_VALUE
////    minValue = Long.MIN_VALUE
////    maxValue = Float.MAX_VALUE
////    minValue = Float.MIN_VALUE
////    maxValue = Double.MAX_VALUE
////    minValue = Double.MIN_VALUE
//
//
//    val arrayEach = arrayOf(1, 2, 3, 4, 5)
//    arrayEach.forEach { println(it) }
//    arrayEach.forEachIndexed { index, element ->
//        if (index % 2 == 0) {
//            println(element)
//        }
//    }
//
//    // range to = 0..100 => 0 sampai 100
//    // until = 0 in 0 until 100 => 0 sampai 99
//    for (value in 0..100) println(value)
//    for (value in 0 until 100) println(value)
//
//    // indices
//    val listindices = listOf('a','b','c')
//    println(listindices.indices)
//    for (i in listindices.indices) println(listindices[i])
//
//    // repeat
//    repeat(100) {
//        println("sammi ganteng")
//    }
//
//    var twodimencyofarray = arrayOf(
//            arrayOf(1,2,3),
//            arrayOf(1,2,3),
//            arrayOf(1,2,3),
//            arrayOf(1,2,3)
//    )
//    if (twodimencyofarray.isEmpty()) return
//    for (i in 0 until twodimencyofarray.size) {
//        for (j in 0 until twodimencyofarray[0].size) {
//            println(twodimencyofarray[i][j])
//        }
//    }
//
//    if (twodimencyofarray.isEmpty()) return
//    for (i in twodimencyofarray.indices) {
//        for (j in 0 until twodimencyofarray[0].size) {
//            println(twodimencyofarray[i][j])
//        }
//    }
//
//    val mapofff = mapOf(
//            1 to "a",
//            2 to "b",
//            3 to "c",
//            4 to "d",
//            5 to "e"
//    )
//
//    println(mapofff)
//    for ((key, value) in mapofff) {
//        println("$key -> $value")
//    }
//    mapofff.forEach { t, u -> println("$t -> $u") }
//    mapofff.keys.forEach { println(it) }
//    mapofff.values.forEach { println(it) }
//
//
//    val pq2 = PriorityQueue<Int>(listOf(2,1,3))
//    while (pq2.isNotEmpty()) {
//        println(pq2.poll())
//    }
//}


fun main() {
    val array = arrayOf(
            intArrayOf(1,2),
            intArrayOf(1,3),
            intArrayOf(3,2),
            intArrayOf(3,4),
            intArrayOf(4,3),
    )
    println(cratedAdjacencyList(array))

}

fun cratedAdjacencyList(pairs: Array<IntArray>): HashMap<Int, MutableList<Int>> {
    val graph: HashMap<Int, MutableList<Int>> =
            hashMapOf()
    pairs.forEach { pair ->
        if (!graph.containsKey(pair[0])) {
            graph[pair[0]] = mutableListOf(pair[1])
        }else {
            val dependencies = graph[pair[0]]
            dependencies!!.add(pair[1])
            graph[pair[0]] = dependencies
        }
    }
    return graph
}

//data class Student(val age: Int)
//
//object absValueComparator : Comparator<Int> {
//    override fun compare(o1: Int, o2: Int): Int {
//        return abs(o1) - abs(o2)
//    }
//}
//
//
//enum class Color{RED,BLACK,BLUE}
//data class Card(val number: Int, val color: Color) : Comparable<Card> {
//    override fun compareTo(other: Card): Int {
//        when (this.color) {
//            other.color -> {
//                return  this.number - other.number
//            }
//            Color.BLACK -> {
//                return 1
//            }
//            else -> {
//                return -1
//            }
//        }
//    }
//}
