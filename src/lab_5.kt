/*
David Monge
006410140
CSE 408
Lab 5
 */

//Number 1
fun main() {
    val n:Int = 5
    val p:Int = 1
    val result:Int

    result = compare(n, p)

    println(+result)
}

// The compare function if x < y return 1, if x > y return -1
//// else return 0.
fun compare(x: Int, y: Int): Int {
    var answer:Int

    if (x < y){
        answer = 1
    }
    else if (x > y){
        answer = -1
    }
    else
    {
        answer = 0
    }
    return answer
}

