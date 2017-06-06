/**
 * Created by khoa on 6/6/2017.
 */
package my.demo
fun main(args: Array<String>):Unit{
    println(sum(b = 3,a=4))
    sumUnit(3,9)
}
fun sum(a: Int,b :Int):Int{
    return a+b
}
fun sumUnit(a:Int,b:Int): Unit{
    println("sum of $a and $b is ${a+b}")
}