package criteriabuilder.org.dss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) 	
	private int emp_id;
	
	private String emp_name;
	
	@OneToMany(
	        mappedBy = "employee"
	       )
	
	    private Set<Adress> addresses =new HashSet<Adress>();
	
	

	

	public Set<Adress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Adress> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Employee( ) {
		super();
	}

	
	
}