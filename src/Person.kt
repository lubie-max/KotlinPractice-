class Person (val name:String , val age:Int) {


//    code intializer
    init {
        println("this is the init block")
    }

    fun action(){
        println("person walks")

    }

    fun greet(){
        println("Hi $name and your age is $age")
    }
}


fun  main(){

    val P = Person ("lubna", 22)
    P.action()
    P.greet()
}