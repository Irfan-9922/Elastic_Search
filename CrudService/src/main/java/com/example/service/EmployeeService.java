package com.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.EmployeeBean;
@RestController
public class EmployeeService {

	public static Map<Integer, EmployeeBean> emp = new HashMap();

	static {
		new EmployeeService();
	}

	EmployeeService() {

		EmployeeBean e1 = new EmployeeBean(100, "irfan",123);
		EmployeeBean e2 = new EmployeeBean(200, "nisar",4563);
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);

	}
	/*
	 * this method returns all employee record from map
	 */

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}
	
	@RequestMapping("/employees")

	public static List<EmployeeBean> getallemp() {

		Collection<EmployeeBean> dd = emp.values();
		ArrayList al = new ArrayList();
		al.add(dd);
		return al;

	}
	/*
	 * below method returns employee record based on id
	 */

	public static EmployeeBean getbid(Object id) {

		return emp.get(id);

	}

	/*
	 * below method delete employee record based on id
	 */
	public static EmployeeBean deleteid(int id) {
		return emp.remove(id);

	}

	/*
	 * below add record to map
	 */

	public static EmployeeBean addemp(EmployeeBean e) {
		emp.put(e.getId(), e);
		return e;
	}

	public static EmployeeBean update(EmployeeBean e) {

		return emp.put(e.getId(), e);
	}
	
}
