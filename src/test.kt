//array with closure
val arrInt = Array(10) { i -> i * 4 * 1.0 }

//uninitialized array
val arr = arrayOfNulls<Int>(20);

//initialze list
val list = listOf("item1", "item2", 34)

//initialize map
val map = mapOf(Pair("first", 1), Pair("Second", 2))

//initialize set
val set = setOf(1, 3, 5)

enum class Demand(val dmd: Int){
    RED(0XFF0000), GREEN(0x00FF00)
}
fun hasPrefix(x:Any) = when(x){

    is String -> x.startsWith("er")
    is Int -> x > 20
    else -> false
}

open class Base(val name:String){
    init {
        println("Initialize Base")
    }
    val test : String = "fsaf"
    open val size: Int = name.length.also { println("Initialize size in Base: $it") }
}
class Derived(name:String,val lastName : String) : Base(name.capitalize().also { println("Argument for base: $it") }){
    init {
        println("Initialize Derived")
    }

    override val size: Int = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }

}



fun main() {
    println(arrInt.max())
    print(list)
    val x = 12;
    println(hasPrefix("fsdaf"))
    println( hasPrefix("ertgf"))
    println(hasPrefix(1))
    println(hasPrefix(15))

    for(i in 6 until 20 step 2){
        println(i)
    }
    Derived("nazmul","hasan")
}