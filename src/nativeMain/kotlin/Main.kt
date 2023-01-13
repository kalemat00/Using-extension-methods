fun main() {
    val list: List<Int> = listOf(1, 2, 3, 344, 454, 5, 6, 8, 433, 99)
    list.filterList().printListOfInt()
}

fun List<Int>.filterList(): List<Int>{
    return this.filter { it < 100 }
}

fun List<Int>.printListOfInt(){
    this.forEach { print("$it ") }
}