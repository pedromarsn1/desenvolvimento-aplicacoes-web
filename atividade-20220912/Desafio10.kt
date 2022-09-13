fun main(){
    var n=100

    fatorial(n)
}


fun fatorial(n : Int){

    if(n == 0){
        return 1
    }else{
        n * fatorial(n-1)
    }
}
