

fun main(){
    outerLoop@ for (i in 1..10) {

        if( i ==4){
            break
        }

        println("i -> $i")

       for (j in 1..7){
            if (j ==6 )  continue@outerLoop
        println("j = $j")
        }
    }

}

