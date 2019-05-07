import java.util.*

fun maxNum(a:Int, b:Int):Int{
    var max = if( a>b){
        println("th value of a is $a")
        a
    }else{
        println("The value of b is $b")
        b
    }
    return max;
}
open class BaseClass{
    val x = 10
}

class DerivedClass : BaseClass(){
    fun foo(){
        println("x is equal to " + x)
    }
}

fun getArray():Array<String>{
    return  Array<String>(size = 20,init = {index -> "Item #$index"})
}
enum class Color(val rgb :Int){
    RED(0xFF0000),
    GREEN(0x00FF00)
}

interface A{
    fun notImplemented()
    fun implementedOnlyInA(){println("only A")}
    fun implementedInBoth() { print("both, A") }
    fun implementedInOne() { print("implemented in A") }
}
interface B {
    fun implementedInBoth() { print("both, B") }
    fun implementedInOne() // only defined
}

class MyClass : A,B {
    override fun notImplemented() {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun implementedInBoth() {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        super<A>.implementedInBoth();
        super<B>.implementedInBoth()
    }

    override fun implementedInOne() {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
       // print("dfdsaf")
    }

}

fun addTwo(x :Int) = x+2
val arr1 = arrayOfNulls<Int>(20);

fun main(){
//    println(maxNum(10,30))
//    println(Arrays.toString(getArray()))
    val doubleArr = doubleArrayOf(10.0,20.0)
//    val map = mapOf(Pair(1, "Item 1"), Pair(2, "Item 2"), Pair(3, "Item 3"))
//    println(map) // prints "{1=Item 1, 2=Item 2, 3=Item 3}
//    listOf(1,2,3,4,5).map(::addTwo)

//    for(a in doubleArr){
//        println(a)
//    }
//    for((i,e) in doubleArr.withIndex()){
//        println("$i,$e")
//    }
//    val a:List<Int?> = listOf(1,2,3,null)
//    val b:List<Int> = a.filterNotNull();
//    val data : String? = null;
//    val str: String = "..."
//    val result = str.also {
//       // Receiver
//        print(it) // Argument
//        42 // Block return value
//    }
//    println(result)

    val myClass =  MyClass()
    myClass.implementedInOne()

}