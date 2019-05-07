//array with closure
import java.util.*
val arrInt = Array(10){i -> i*4*1.0 }

//uninitialized array
val arr = arrayOfNulls<Int>(20);

//initialze list
val list = listOf("item1", "item2",34)

//initialize map
val map = mapOf(Pair("first",1), Pair("Second",2))

//initialize set
val set = setOf(1,3,5)

fun main(){
    println(arrInt.max())
    print(list)
}