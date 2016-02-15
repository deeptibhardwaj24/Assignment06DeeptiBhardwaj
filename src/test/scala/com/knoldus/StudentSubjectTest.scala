/*package com.knoldus
import org.scalatest.FunSuite
/**
  * Created by knoldus on 12/2/16.
  */
class StudentSubjectTest extends FunSuite{
  test("inserting student_subject info"){

    intercept[com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException] {

      val obj = new StudentSubject
      val result = obj.addStudentSubjectInfo(7, 10)
      assert(result === 1)
    }
  }

}*/
