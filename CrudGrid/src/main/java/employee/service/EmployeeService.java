package employee.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import employee.Employee;
public class EmployeeService {


	public static  Map<Integer, Employee> emp = new HashMap();


	public EmployeeService() {

		Employee e1 = new Employee(1, 12,"irfan");
		Employee e2 = new Employee(2, 222,"nisar");
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		
	
	}
	/*
	 * this method returns all employee record from map
	 */

	public  ArrayList getallemp() {

		Collection<Employee> dd = emp.values();
		ArrayList al = new ArrayList<>();
		al.add(dd);
		return al;

	}
	/*
	 * below method returns employee record based on id
	 */

	public  Employee getbid(Object id) {

		return emp.get(id);

	}

	/*
	 * below method delete employee record based on id
	 */
	public  Employee deleteid(int id) {
		return emp.remove(id);

	}

	/*
	 * below add record to map
	 */

	public  Employee addemp(Employee e) {
		emp.put(e.getId(), e);
		return e;
	}

	public  Employee update(Employee e) {

		return emp.put(e.getId(), e);
	}
	public  void main(String[] args) {
		
		System.out.println(getallemp());
	}

}
