package com.pracitse
import scala.collection.mutable.ListBuffer


class AnimalField[T<:Animal,S<:Animal](x: T) extends abstractFieldA[T,S] {
  
  val listAnimal:ListBuffer[T]= new ListBuffer[T]()
  val listAnimal2:ListBuffer[Animal]= new ListBuffer[Animal]()
  
  listAnimal+=x
  listAnimal2+=x

  
  def AnimalField(x:T):List[T]={
    
     listAnimal+=x
     val animalList:List[T]=listAnimal.toList
     animalList  
  }
  
  def addFirstSameType(x:T):Option[T]={
    System.out.println("Begin option")
    listAnimal2+=x   
    System.out.println("ListItem Lenth is:"+ listAnimal2.length)
    val lastIn= listAnimal2.length   
    val element:Option[T]=if(listAnimal.length==0) None else Some(listAnimal2(lastIn-1).asInstanceOf[T])
    System.out.println("end option")
    element
        
}
  
  def addSecondDiffType(x:S):Option[S]={
      System.out.println("Begin second option")
      listAnimal2+=x
      val lastIn= listAnimal2.length
      val element:Option[S]=if(listAnimal2.length==0) None else Some(listAnimal2(lastIn-1).asInstanceOf[S])
      element
   
  }
}
