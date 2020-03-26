package com.jason.client;

import com.jason.domain.Student;
import com.jason.util.JasonUtils;

public class JasonExampleClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setCource("JasonCousrce");
		student.setName("Roshan");
		student.setStudentId(101);
		
		//converting object to jason
		String jasonString = JasonUtils.javaObjToJason(student);
		System.out.println(jasonString);
		
		//converting jason 
		//String jasonString2 = "{"+"studentId" +":"+102+","+"name"+":"+"Shubham"+","+"cource"+":"+"JavaCourse"+"}";
		Student student2 =JasonUtils.jasonToJavaObj(jasonString, Student.class);
		System.out.println("------------------------------------");
		System.out.println(student2.getCource()+student.getStudentId()+student2.getName() );
	}

}
