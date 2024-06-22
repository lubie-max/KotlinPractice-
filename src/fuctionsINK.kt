import java.time.LocalDate


fun  greet(name: String):Unit{
    println("Hi $name")

}

fun greet2(name: String) =  "Hello dear $name"


fun addTwoVal(a:Int , b:Int):Int {
    return  a +b
}

fun Bio(name:String ="Lubna", age: Int , dob:LocalDate = LocalDate.now()): String{
    return "hi $name , you re $age , so your dob is $dob"
}


fun main(){
//
//    greet("Lubna")
//    println( greet2("salona"))
//
//    println( addTwoVal(2,3) )

    println( Bio(age = 22) )
}