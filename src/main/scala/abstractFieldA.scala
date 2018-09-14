package com.pracitse

abstract class abstractFieldA[T,S] {
  
  def addFirstSameType(x:T):Option[T];
  
  def addSecondDiffType(x:S):Option[S];
}
