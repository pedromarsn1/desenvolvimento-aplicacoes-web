**Herança**
* A herança faz com que seja possível o resuso do código e dá sentido a abstração,
a partir dela podemos "ligar" uma clsse a outra, fazendo com que elas tenha um vínculo
de uso, por exemplo: nesse projeto usamos a classe humano, mamifero e animal, a classe animal é a mais abstrata que existe e pode ser qualquer tipo de animal,
  mamifero, ovíparo e viviparo. Caminhando para o mais preciso, criamos os mamiferos, que nao podem ser
  ovíparos e viviparos, e concentrando mais ainda, temos os humanos que é o fim dessa abstração, ele é o mais específico que existe
  nesse projeto. 

**Uso**

* Em kotlin somente é possível extender uma classe se ela for uma open class.