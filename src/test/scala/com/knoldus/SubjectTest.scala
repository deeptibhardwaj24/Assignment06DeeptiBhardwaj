package com.knoldus
import org.scalatest.FunSuite
/**
  * Created by knoldus on 12/2/16.
  */
class SubjectTest extends FunSuite{

  test("Adding subject info"){
    val obj = new Subject
    val result = obj.insertSubjectInfo("C")
    assert(result === 1)

  }

  test("Displaying subject info")
  {
    val obj = new Subject
    val result = obj.displaySubjectInfo()
    assert(result === List("java" , "Computer Networks", "C"))
  }
  }
