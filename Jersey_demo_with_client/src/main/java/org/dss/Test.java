package org.dss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dss.beans.Employee;
import org.dss.db.db;

@Path("/employees")
@Produces({MediaType.APPLICATION_XML ,MediaType.APPLICATION_JSON,MediaType.TEXT_HTML})
public class Test {

	
	
	@GET
	
	
	public List<Employee> allemp() {
		List<Employee> ff = db.getAllEmployees();
		System.out.println(ff+"from service");
		return ff;
	}

	
	@Path("/test")
	public String res() {
		return "welcome to DSS";
	}
	

	@Path("/{i}")
	@GET
	public Employee employeeById(@PathParam("i") int i) {

		return db.getEmployee(i);
	}

	@DELETE
	@Path("/{i}")
	public void deleteEmployeeById(@PathParam("i") int id) {
		db.deleteEmployee(id);
	}
	
	@PUT

	public Employee upadateEmployee(Employee e) {
		
		return db.updateEmployee(e);
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Employee creat(Employee e) {
		
		return db.creatresource(e);
	}
	
}
