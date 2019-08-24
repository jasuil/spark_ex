package com.scalademo.basic

object Ex02TypesAndVariables {
  
  def main(args: Array[String]) = {
    
  	var name = "John Doe"		// 이후에 값을 변경할 수 있는 저장소
  	val gender = "Male"		// 이후에 값을 변경할 수 없는 저장소
  	val age: Int = 35		// 자료형을 명시해서 변수 선언 
  	val message = """This is 
multiline string message. 
Please check the result !!!!!"""
  	
  	//var phone;			//오류 – 초기화 필수
  	
  	var company = None		//빈 값으로 초기화 ( or null )
  	
  	//email = "johndoe@example.com" 	//오류 – var 또는 val 지정 필수
  	
  	printf("%s, %s, %d, %s\n", name, gender, age, company)
  	println(message)
  	
  	printf("%d - %d\n", 0x10, 0xff)
  	
  	println("Hello\tWorld\n\n" );
  	
  	println(scala.None == null)
  	
  }
  
}