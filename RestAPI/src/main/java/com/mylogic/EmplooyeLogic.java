package com.mylogic;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mybens.Employees;
@Path("/emp")
public class EmplooyeLogic {
	EmployeeRepository repo= new EmployeeRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/empget")
		public List<Employees> getEmp() {
			return repo.getemp();
		}

	@GET
	@Path("/empid")
	@Produces(MediaType.APPLICATION_JSON)
	
		public Employees getEmpid(@QueryParam("id") int id) {
			return repo.geteid(id);
		}

//

@POST
@Path("/setemp")
@Consumes(MediaType.APPLICATION_JSON)

public Employees postemp(Employees e){
	System.out.println(e);
	repo.createEmp(e);
	return e;
}


}


