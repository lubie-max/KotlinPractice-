


fun  greet(name: String):Unit{
    println("Hi $name")

}

fun greet2(name: String) =  "Hello dear $name"


fun addTwoVal(a:Int , b:Int):Int {
    return  a +b
}


fun main(){

    greet("Lubna")
    println( greet2("salona"))

    println( addTwoVal(2,3) )
}