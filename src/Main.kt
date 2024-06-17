//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val name = "Lubna"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//    print("Hello, " + name + "!")

    fun  coldSum(a:Int , b:Int):Int {
        return  a + b *a
    }

    println( coldSum(3, 6) )


    fun prntName(){
    val name  = "lubna"

    println("$name and this is me, ${name}")

    }

//    prntName()

    val age:Int = 24
//    println("$age and this is me, ${age}")


    if (age > 20) {
       println(" $age is applicable ")
    }
    else if (age< 20){
        println(" $age is not applicabl.")
    }
    else{
        println(" invalid ")
    }

    val a = 20
    val result = when (a) {
        1 -> {
            println("Gold")
        }
        2 -> {
            println("Silver")

        }
        else -> {
            println("invalid")
        }
    }

    println(result)



    val x = 10
    val y = 90
    if (x in 10..y+1) {
        println("fits in range")
    }


//  loops
}
