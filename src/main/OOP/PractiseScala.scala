package com.pracitse
import scala.collection.immutable.ListMap

case  class Mammal( override val name :String,IDNumber:String) extends Animal(name)

case  class Zebra( override val  name :String,val IDNumber:String,val food:String) extends Animal(name)


object scalaType {

  
 def upperCaseString(str1:String*)={
   
   var str2=str1.map(_.toUpperCase())
    str2  
 }
 
  def upperCaseAnimalString(str1:Animal*)={
   
   var str2=str1.map(_.name.toUpperCase())
    str2  
 }
  
  
 def handleListAniaml(listAnimal:Animal*)={
   val ListAnimalName= for (animal <- listAnimal)
     yield animal.name.toUpperCase()

 
 }
 
  def handleListAniaml2(listAnimal:Animal*)={
   val ListAnimalName= 
     for (animal <- listAnimal)
    yield {
       val name1 = animal.name.toUpperCase()
       name1
     } 
   ListAnimalName

 }
  
  
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
  
  
  val listString=List("tst1","test2","test5")
  
  val listBufferItem: ListMap[String,Animal]=ListMap("fist" -> fistMammal ,"second"-> secondMammal,"third" -> secondElephant)
  
  val listString_Upper= upperCaseString(listString:_*)
//  listString_Upper.foreach(println)
  
  val nameList=handleListAniaml2(listBufferItem.values.toArray:_*)
  
//  nameList.foreach(println)
  val namelist2=upperCaseAnimalString(listBufferItem.values.toArray:_*)
  namelist2.foreach(println)
  
 

  
  
}
  
}
