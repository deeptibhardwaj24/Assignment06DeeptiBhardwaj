package com.knoldus.connection

import java.sql._
/**
  * Created by knoldus on 12/2/16.
  */
class ConnectionHelper {


    val driver:String = "com.mysql.jdbc.Driver"
    val path:String = "jdbc:mysql://localhost/student_subject_schema"
    val username:String = "root"
    val password:String = "knoldus"

    def connectDB():Connection={

      try{
        Class.forName(driver)
        val connection:Connection = DriverManager.getConnection(path,username,password)
        println("Connected")
        connection
      }
      finally{
        println("NO")
      }
    }
  }