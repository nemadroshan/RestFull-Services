package com.mylogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mybens.Employees;

public class EmployeeRepository {

	private static List<Employees> emplist = new ArrayList<Employees>();
	
	public void emp()
	{
	
		Employees emp= new Employees();
		emp.setEid(101);
		emp.setEname("sanju");
		emp.setEmail("sk@gamil.com");
		
		Employees emp1= new Employees();
		emp1.setEid(102);
		emp1.setEname("manu");
		emp1.setEmail("sk11123@gamil.com");
		
		emplist.add(emp1);
		
		emplist.add(emp);
	
	}

	public List<Employees> getemp(){
		emp();
		return emplist;	
	}
	
	public void createEmp(Employees e) {
		// TODO Auto-generated method stub
		emplist.add(e);
	}

	public Employees geteid(int id) {
		// TODO Auto-generated method stub
		emp();
		for(Employees e : emplist) {
			if(e.getEid()==id) {
				return e;
			}
		}
		return null;
	}
	
	
	
}
