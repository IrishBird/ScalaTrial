package com.pracitse

case  class Mammal( override val name :String,IDNumber:String) extends Animal(name)

case  class Zebra( override val  name :String,val IDNumber:String,val food:String) extends Animal(name)


object scalaType {
  
  
def main(arg: Array[String]) {
  
 
  val fistMammal:Mammal= Mammal("emily","123")
  val secondMammal:Mammal= Mammal("emma","456")
  
  val firstElephant:Elephant=new Elephant("henry","679")
  val secondElephant:Elephant=new Elephant("edward","888")
  
  val animalFields :AnimalField[Elephant,Zebra] = new AnimalField[Elephant,Zebra](firstElephant);
  
  val listItem= animalFields.addFirstSameType(secondElephant)
  
  System.out.println("First mamal's name is "+listItem.get.name)
  System.out.println("First mamal's name is "+listItem.get.IDNumber)
  
  val animal1:Zebra= Zebra("Unkown","999","grass")
  
  val secondAnimal= animalFields.addSecondDiffType(animal1)
  
 
  System.out.println("secondAnimal  name is "+secondAnimal.get.food)

  
  
}
  
}
