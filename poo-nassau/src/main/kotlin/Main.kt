import model.Animal
import model.Humano

fun main(){
    val lobo = Animal()
    lobo.especie = "Canis lupus signatus"
    lobo.porte="médio"
    lobo.vertebrado=true
    lobo.sexo="fem"

    val humano = Humano()
     humano.feetNumber = 35
     humano.especie="Homo sapiens sapiens"
     humano.skinColor="preto"
     humano.sexo="mas"
     humano.aquatico = false
     humano.onifero = true


     humano.alimentar(humano)
     lobo.alimentar(lobo)

     println(humano.feetNumber)
     println(lobo.especie)
}
