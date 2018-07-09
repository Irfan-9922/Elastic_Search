package criteriabuilder.org.dss;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="demo")
public class demo {
	
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	String id	;
	
	

	@Column(name="name")
	String name	;



	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + "]";
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
