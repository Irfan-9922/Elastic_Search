package employee;

public class Employee {
	
	private int id;
	private int sal;
	private String name;
	/**
	 * @param id
	 * @param sal
	 * @param name
	 */
	public Employee(int id, int sal, String name)
	{
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	
	/**
	 * 
	 */
	public Employee()
	{
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}


	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}

}
