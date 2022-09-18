package model

import interfaces.Alimentacao

open class Animal : Alimentacao {

    var especie = ""
    var tamanho = 0.0
    var porte = ""
    var sexo = ""
    var vertebrado = false;


    override fun alimentar(humano: Humano) {
        println("Humando sendo alimentado")
    }

    override fun alimentar(animal: Animal) {
        println("${animal.especie} sendo alimentado")
    }

}