fun main() {
    create()
    arith()
    grammar()

    var text=string("happy","halloween","day")
    println(text.contentToString())

}
fun create() {
    var array= arrayOf("year","month","day")
    println(array.contentToString())
}
fun grammar(){
    var cities= arrayOf("mumbai", "dodoma", "jakarta")
        println(cities.map { it.capitalize() })
    }

fun arith(){
  var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1]+numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    var order=numbers.sortedArray()
    println(order.toString())
}
fun string(name:String,name1:String, name2:String):Array<String>{
   var stmt= arrayOf<String>("$name, $name1 ,$name2")
    return stmt

}
