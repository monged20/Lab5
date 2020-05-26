// David Monge
// CSE 408
// Lab 5 Number 4

import java.io.File
import java.io.InputStream

// main function
fun main(){
    val inputStream: InputStream = File("test.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().useLines {
        lines -> lines.forEach {
        lineList.add(it)
    }
        lineList.forEach{
            println (">" + it)
        }
    }


}