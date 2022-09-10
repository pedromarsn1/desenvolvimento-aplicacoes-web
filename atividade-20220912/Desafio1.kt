fun main() {
    println("Hello, world!!!")

    multiplosTres()
}

fun multiplosTres(){

    for(i in 1..500){
        if(i%3==0){
            println("Esses são os múltiplos de 3: $i")
        }
    }
}