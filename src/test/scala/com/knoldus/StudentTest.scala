package com.knoldus
import org.scalatest.FunSuite
/**
  * Created by knoldus on 12/2/16.
  */
class StudentTest extends FunSuite{

  test("ADDing Student data")
  {

    val obj = new Student
    val result = obj.insertStudentInfo("rahul" , "rahul@knoldus.com", 9656751166L)
    assert(result === 1)

  }


  test("deleting student data")
  {
    val obj = new Student
    val result = obj.removeStudentInfo(4)
    assert(result === 1)


  }

test("Displaying data")
  {
    val obj = new Student
    val result = obj.displayStudentInfo()
    assert(result === List("kunal" , "kunal@knoldus.com", "965028765"))
  }
}
