package criteriabuilder.org.dss;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.SetJoin;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class CriteriaBuilderDemo {

	private static final String PERSISTENCE_UNIT_NAME = "JPACriteriaBuilder";
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
			.createEntityManager();
	static CriteriaBuilder criteriaBuilderObj = entityMgrObj.getCriteriaBuilder();
	static CriteriaQuery<Employee> query=null;

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

	/*	// ===================hibernate select opretion ==========================
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		  List list = session.createCriteria(Employee.class).list(); long endTime =
		  System.currentTimeMillis(); System.out.println("*************"+endTime);
		 System.out.println("###"+(endTime-startTime));
		  System.out.println("employee::"+list);
		 
		 
		  long startTime1 = System.currentTimeMillis();
		 */
		// =======================================================

		// ===================criteriabuilder select opretion ==========================
		  System.out.println("*************"+startTime); CriteriaBuilder
		  criteriaBuilderObj = entityMgrObj.getCriteriaBuilder();
		  
		  // Making The Query Object From The 'CriteriaBuilder' Instance
		  CriteriaQuery<Object> queryObj = criteriaBuilderObj.createQuery();
		  Root<Employee> from = queryObj.from(Employee.class); CriteriaQuery<Object>
		  selctQuery = queryObj.select(from); TypedQuery<Object> ff =
		  entityMgrObj.createQuery(selctQuery); 
		  List<Object> gg = ff.getResultList();
		  System.out.println(gg);
		  long endTime = System.currentTimeMillis();
		  System.out.println("###"+(endTime-startTime));
		 
		// =======================================================

		// ==================critria Jion ===================

		/*
		 * Criteria criteria = session.createCriteria(Employee.class);
		 * criteria.setFetchMode("Adress", FetchMode.JOIN).add(Restrictions.eq("id",
		 * 1));
		 * 
		 * List list1 = criteria.list();
		 */

		// ==================critriaBuilder Jion ===================
		List<Employee> list =new ArrayList<>();
		query = criteriaBuilderObj.createQuery(Employee.class);
		/*Root<Employee> root = query.from(Employee.class);
		Join<Employee, Adress> joinforadress = root.join(Employee_.addresses);
		Join<Adress, People> joinforpeople =joinforadress.join(Adress_.people);
		query.where(criteriaBuilderObj.equal(joinforpeople.get(People_.name), "sql"));
		CriteriaQuery<Employee> result = query.select(root).where(adresscityPredicate(root));
		System.out.println(result);
	//	query.select(root);
		TypedQuery<Employee> resultQuery = entityMgrObj.createQuery(query);
	 list = resultQuery.getResultList();
		System.out.println(list);*/
		
		//=====================================//
		
		Root<Employee> employeeRoot =query.from(Employee.class);
		Root<People> adressRoot =query.from(People.class);
		
		
		
		
		
		
		
		
		/*CriteriaQuery<Employee> query = criteriaBuilderObj.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		SetJoin<Employee, Adress> joinforadress = root.join(Employee_.addresses,JoinType.INNER);

		Join<Adress, People> joinforpeople =joinforadress.join(Adress_.people);
		query.where(criteriaBuilderObj.equal(joinforpeople.get(People_.peopleId), 12));
		TypedQuery<Employee> resultQuery = entityMgrObj.createQuery(query);
		List<Employee> list = resultQuery.getResultList();
		System.out.println(list);*/
		
		
		
		

		/*
		 * Join<Employee, Adress> joins = root.join("addresses"); List<Employee>
		 * employee = entityMgrObj.createQuery( query ).getResultList();
		 * System.out.println(employee.get(0).getEmp_id());
		 */

		// Step #1 - Displaying All Records
		System.out.println("\n! Display All Records For The 'Employee' Table !\n");

		/*
		 * CriteriaQuery<Object> selectQuery = queryObj.select(from);
		 * TypedQuery<Object>typedQuery = entityMgrObj.createQuery(selectQuery);
		 * List<Object> employeeList = typedQuery.getResultList();
		 * 
		 * if(employeeList != null && employeeList.size() > 0) { for(Object obj
		 * :employeeList)
		 * 
		 * { Employee emp = (Employee)obj; System.out.println(emp.toString()); } } else
		 * { System.out.
		 * println("! ALERT - No Employees Are Present In The 'Employee' Table !"); }
		 */
		/*
		 * // Step #2 - Displaying All Records In An Ordered Fashion System.out.
		 * println("\n! Displaying All Records For The 'Employee' Table In An Asc. Order !\n"
		 * ); CriteriaQuery<Object> ascSelectQuery = queryObj.select(from);
		 * ascSelectQuery.orderBy(criteriaBuilderObj.asc(from.get("emp_name")));
		 * TypedQuery<Object> ascTypedQuery = entityMgrObj.createQuery(ascSelectQuery);
		 * List<Object> ascEmployeeList = ascTypedQuery.getResultList();
		 * 
		 * if(ascEmployeeList != null && ascEmployeeList.size() > 0) { for(Object obj :
		 * ascEmployeeList) { Employee emp = (Employee)obj;
		 * System.out.println(emp.toString()); } } else { System.out.
		 * println("! ALERT - No Employees Are Present In The 'Employee' Table !"); } }
		 */
	}

	public static Predicate adresscityPredicate(Root<Employee> root) {
		SetJoin<Employee, Adress> joinforadress = root.join(Employee_.addresses);
		Predicate namepredicate = criteriaBuilderObj.equal(joinforadress.get(Adress_.CITY),"mumbai");
		return namepredicate;
	}
	

}