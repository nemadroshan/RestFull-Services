package com.jason.utils;

import com.google.gson.Gson;
import com.jason.beans.Employee;

public class ObjectToJasonConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
	emp1.setName("Roshan");
	emp1.setDepartment("Software Development");
	emp1.setSalary(8500);
	emp1.setEmpId(181);
	emp1.setDesignation("Java Developer");
	String gson = new Gson().toJson(emp1);
	System.out.println(gson);
	}

}
