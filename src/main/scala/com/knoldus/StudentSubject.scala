package com.knoldus

import com.knoldus.connection._

/**
  * Created by knoldus on 12/2/16.
  */
class StudentSubject {

  def insertStudentSubjectInfo(stud_id: Int, sub_id : Int):Int={

    val dbObj = new ConnectionHelper
    val conn = dbObj.connectDB()
    val query = "INSERT INTO student_subject(stud_id, sub_id) values('"+stud_id+"', '"+sub_id+"')"
   val statement= conn.createStatement()
    val result = statement.executeUpdate(query)
    result

  }

}
