package org.demo;

public class employeeService {
	
	
	public int apprisel(Employee emp) {
		
		int app=0;
		if(emp.getSal()<=1000) {
			
			return app =emp.getSal()+1000;
			
		}
		else {
			return app=emp.getSal()+2000;
		}
	}
	
	public int annualSal(Employee e) {
		
		int sal=0;
		sal=e.getSal()*12;
		return sal;
	}

	
}
