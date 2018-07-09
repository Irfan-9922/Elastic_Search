package criteriabuilder.org.dss;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMP_ADRESS")
public class Adress {
	
	
	

	public Set<People> getPeople() {
		return people;
	}

	public void setPeople(Set<People> people) {
		this.people = people;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column(name="countery")
	String countery;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="zipcode")
	String zipcode	;
	
	@OneToMany(mappedBy = "adress")
	Set<People> people =new HashSet<>();
	
	 @ManyToOne
	    @JoinColumn(
	        name = "emp_id")
	Employee employee;
	
	@Column(name="ADDRESS")
	String ADDRESS	;
	
	@Column(name="CONTACT")
	String CONTACT;	
	
	@Column(name="CITY")
	String CITY	;
	
	@Column(name="DISTRICT")
	String DISTRICT;
	
	@Column(name="STATE")
	String STATE;
	

	

	public String getCountery() {
		return countery;
	}

	public void setCountery(String countery) {
		this.countery = countery;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getCONTACT() {
		return CONTACT;
	}

	public void setCONTACT(String cONTACT) {
		CONTACT = cONTACT;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}

	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}

	@Override
	public String toString() {
		return "Adress [countery=" + countery + ", zipcode=" + zipcode + ", ADDRESS=" + ADDRESS + ", CONTACT=" + CONTACT
				+ ", CITY=" + CITY + ", DISTRICT=" + DISTRICT + ", STATE=" + STATE + "]";
	}

	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
