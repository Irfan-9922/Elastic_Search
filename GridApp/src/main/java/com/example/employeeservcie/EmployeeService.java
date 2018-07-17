/**
 * All rights are reserved for diss.
 */
package com.example.employeeservcie;

import java.util.ArrayList;
import java.util.List;

import com.example.employeebean.EmoployeeBean;
import com.example.employeedao.EmployeeDao;

/**
 * @author i.shaikh
 *
 * @Date  Mar 1, 2018
 * @Time  2:32:37 PM
 */
public class EmployeeService {
	
	
	EmoployeeBean b=new EmoployeeBean(1, "irfan", 1245);
	EmoployeeBean b1=new EmoployeeBean(2, "nisar", 1234);
	EmoployeeBean b2=new EmoployeeBean(3, "ramesh", 1644);
	EmoployeeBean b3=new EmoployeeBean(4, "suresh", 1644);
	
	List<EmoployeeBean> al=new ArrayList();
  
public List<EmoployeeBean> getallfromservice(){
	EmployeeDao dao=null;
	al.add(b);
	al.add(b1);
	al.add(b2);
	al.add(b3);
	
	return al;
}
	public static void main(String[] args) {
		EmployeeService v=new EmployeeService();
		System.out.println(v.getallfromservice());
	}

}
