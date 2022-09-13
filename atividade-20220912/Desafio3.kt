fun main(){
    var numero : Int
    var vp : Int = 0
    var vn: Int = 0
    var soma : Int = 78
    var quantidade : Int = 0
    var porcenVP : Int
    var porcenVN : Int

    numero.readLine()

    while(numero != 0){
        if( numero%2 == 0){
            vp++
        }else{
            vn++
        }

        if(numero == null){
            println("insira um número válido")
        }else{
            soma += numero
            quantidade += numero
        }

    }

    var mediaA = numero/quantidade
    porcenVP = vp/quantidade
    porcenVN = vn/quantidade
}
