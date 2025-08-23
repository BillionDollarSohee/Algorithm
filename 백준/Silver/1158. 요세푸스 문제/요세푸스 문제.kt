import java.util.LinkedList

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val q: LinkedList<Int> = LinkedList((1..n).toList())

    val result = mutableListOf<Int>()

    while (q.isNotEmpty()) {
        repeat(k - 1) {
            q.add(q.poll()) // 앞에서 빼서 뒤에 넣기
        }
        result.add(q.poll()) // K번째 제거
    }

    println("<${result.joinToString(", ")}>")
}