fun main() {
    var altura1 = 1.45
    var altura2 = 1.80
    var altura3 = 0.89
    var altura4 = 1.75
    var altura5 = 1.05
    var altura6 = 1.18
    var altura7 = 1.90
    var altura8 = 1.80
    var altura9 = 1.97
    var altura10 = 1.12
    var altura11 = 1.00
    var altura12 = 1.15
    var altura13 = 1.48
    var altura14 = 1.64
    var altura15 = 1.57

    maiorAltura(altura1,altura2,altura3,altura4,altura5,altura6,altura7,altura8,altura9,altura10,altura11,altura12,altura13,altura14,altura15)
    menorAltura(altura1,altura2,altura3,altura4,altura5,altura6,altura7,altura8,altura9,altura10,altura11,altura12,altura13,altura14,altura15)

}

fun maiorAltura(altura1 : Double,altura2 : Double,altura3 : Double,altura4 : Double,altura5 : Double,altura6 : Double,altura7 : Double,altura8 : Double,altura9 : Double,altura10 : Double,altura11 : Double,altura12 : Double,altura13 : Double,altura14 : Double,altura15 : Double){
    var alturaMinima = 0.0

    if(altura1 > alturaMinima){
        alturaMinima = altura1
    }
    if(altura2 > alturaMinima){
        alturaMinima = altura2
    }
    if(altura3 > alturaMinima){
        alturaMinima = altura3
    }
    if(altura4 > alturaMinima){
        alturaMinima = altura4
    }
    if(altura5 > alturaMinima){
        alturaMinima = altura5
    }
    if(altura6 > alturaMinima){
        alturaMinima = altura6
    }
    if(altura7 > alturaMinima){
        alturaMinima = altura7
    }
    if(altura8 > alturaMinima){
        alturaMinima = altura8
    }
    if(altura9 > alturaMinima){
        alturaMinima = altura9
    }
    if(altura10 > alturaMinima){
        alturaMinima = altura10
    }
    if(altura11 > alturaMinima){
        alturaMinima = altura11
    }
    if(altura12 > alturaMinima){
        alturaMinima = altura12
    }
    if(altura13 > alturaMinima){
        alturaMinima = altura13
    }
    if(altura14 > alturaMinima){
        alturaMinima = altura14
    }
    if(altura15 > alturaMinima){
        alturaMinima = altura15
    }

    println("A Maior Altura é: $alturaMinima")


}

fun menorAltura(altura1 : Double,altura2 : Double,altura3 : Double,altura4 : Double,altura5 : Double,altura6 : Double,altura7 : Double,altura8 : Double,altura9 : Double,altura10 : Double,altura11 : Double,altura12 : Double,altura13 : Double,altura14 : Double,altura15 : Double){
    var alturaMinima = 10000.00

    if(altura1 < alturaMinima){
        alturaMinima = altura1
    }
    if(altura2 < alturaMinima){
        alturaMinima = altura2
    }
    if(altura3 < alturaMinima){
        alturaMinima = altura3
    }
    if(altura4 < alturaMinima){
        alturaMinima = altura4
    }
    if(altura5 < alturaMinima){
        alturaMinima = altura5
    }
    if(altura6 < alturaMinima){
        alturaMinima = altura6
    }
    if(altura7 < alturaMinima){
        alturaMinima = altura7
    }
    if(altura8 < alturaMinima){
        alturaMinima = altura8
    }
    if(altura9 < alturaMinima){
        alturaMinima = altura9
    }
    if(altura10 < alturaMinima){
        alturaMinima = altura10
    }
    if(altura11 < alturaMinima){
        alturaMinima = altura11
    }
    if(altura12 < alturaMinima){
        alturaMinima = altura12
    }
    if(altura13 < alturaMinima){
        alturaMinima = altura13
    }
    if(altura14 < alturaMinima){
        alturaMinima = altura14
    }
    if(altura15 < alturaMinima){
        alturaMinima = altura15
    }

    println("A Menor Altura é: $alturaMinima")


}