package com.knoldus

import com.knoldus.connection._

import scala.collection.mutable.ListBuffer

/**
  * Created by knoldus on 12/2/16.
  */
class Subject {

  def insertSubjectInfo(subname:String):Int={

    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
    val query= "INSERT INTO subject(sub_name) values('"+subname+"')"
    val statement = conn.createStatement()
    val result= statement.executeUpdate(query)
    print(result)
    result

  }

  def removeSubjectInfo(sub_id : Int): Unit ={

    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
  }



  def displaySubjectInfo(): List[String] =
  {
    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
    val query = "SELECT * FROM subject "
    val statement = conn.createStatement()
    val result = statement.executeQuery(query)
    val subjectList = new ListBuffer[String]
    while(result.next)
    {
      subjectList+= result.getString("sub_name")
    }

    subjectList.toList
  }
  }

