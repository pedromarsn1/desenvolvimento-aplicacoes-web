package interfaces

import model.Animal
import model.Humano

interface Alimentacao {
    fun alimentar(humano : Humano);
    fun alimentar (animal: Animal);
}