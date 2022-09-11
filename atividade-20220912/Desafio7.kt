fun main(){
    var num = 4;
    tabuada(num)
}

fun tabuada(num : Int){
    for (i in 1..10){
        var resultado = i * num
        println("$i X $num = $resultado")
    }


}