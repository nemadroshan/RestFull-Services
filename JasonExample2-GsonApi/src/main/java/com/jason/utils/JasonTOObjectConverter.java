package com.jason.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.jason.beans.Employee;

public class JasonTOObjectConverter {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("Emp.jason");
			Gson gson = new Gson();
			Employee emp = gson.fromJson(reader, Employee.class);
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
