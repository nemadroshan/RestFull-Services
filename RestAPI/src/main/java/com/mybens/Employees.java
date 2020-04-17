package com.mybens;

import org.codehaus.jackson.annotate.JsonProperty;

public class Employees {

@JsonProperty("empid")
private int eid;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@JsonProperty("empname")
private String ename;

@JsonProperty("empemail")
private String email;
	
}
