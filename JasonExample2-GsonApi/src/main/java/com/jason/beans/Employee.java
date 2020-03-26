package com.jason.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class Employee {
	@SerializedName("emp_id")
	@Expose
	private int empId;
	@Expose
	private String name;
	@Expose
	private String designation;
	@Expose
	private String department;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Expose
	private long salary;
}
