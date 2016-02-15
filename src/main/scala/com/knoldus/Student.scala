package com.knoldus
import java.sql._
import com.knoldus.connection._
import org.slf4j.{LoggerFactory, Logger}
import scala.collection.mutable.ListBuffer


/**
  * Created by knoldus on 12/2/16.
  */
class Student {
val logger:Logger = LoggerFactory.getLogger(this.getClass)

  def insertStudentInfo(name: String, email: String, phone: Long): Int = {
  logger.info("Entering info in Student table!!")
    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
    val query = "INSERT INTO student(stud_name, stud_email, stud_phone) values('" + name + "', '" + email + "', '" + phone + "')"
    val statement = conn.createStatement()
    val result = statement.executeUpdate(query)
    print(result)
    result
  }

  def removeStudentInfo(id: Int): Int = {
    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
    val query = "DELETE FROM student WHERE stud_id = '" + id + "'"
    val statement = conn.createStatement()
    val result = statement.executeUpdate(query)
    result
  }

  def displayStudentInfo(): List[String] ={
    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
    val query = "SELECT * FROM student "
    val statement = conn.createStatement()
    val result = statement.executeQuery(query)
    val studentList = new ListBuffer[String]
    while(result.next)
      {

        studentList+= result.getString("stud_name")
        studentList+=result.getString("stud_email")
        studentList+=result.getString("stud_phone")

      }

    studentList.toList
  }
}


