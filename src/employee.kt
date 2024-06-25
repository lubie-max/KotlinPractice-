data class employee(val name: String, val age: Int)


fun  main(){

    val e = employee("lubna", 23)

    println("hey ${e.name} , u turned $e.age this month.")

    val e1 = e.copy()
    println(" e = e1 is ${e == e1}")
}