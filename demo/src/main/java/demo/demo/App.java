package demo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



/**
 * Hello world!
 *
 */
public class App 
{
	
	public List<Object> getcustomer(List<Customer> cst){
		
		
		return cst.stream().sequential().collect(Collectors.toList());
		
	}
    public static void main( String[] args )
    {
    	HdfcIfscCodeEntity hd1=new HdfcIfscCodeEntity("ICICI", "121312", "12131", "PUNE", "PUNE", "99228657", "PUNE", "PUNE", "Mh");
    	HdfcIfscCodeEntity hd2=new HdfcIfscCodeEntity("ICICI", "2324234", "454646", "MUMBAI", "MUMBAI", "121323", "MUMBAI", "MUMBAI", "Mh");
    	ArrayList<Customer> cs=new ArrayList<Customer>();
    	ArrayList<HdfcIfscCodeEntity> hdfc=new ArrayList<HdfcIfscCodeEntity>();
    	
    	
    	hdfc.add(hd1);
    	hdfc.add(hd2);
    	
    	Customer c=new Customer(123l, "irfan", "9922", "234234", "2323","ICICI");
    	Customer c1=new Customer(2323l, "nisar", "23234", "454545", "4545","ICICI");
    	Customer c2=new Customer(65656l, "rohit", "45454", "55555", "5656","hdfc");
    	cs.add(c);
    	cs.add(c1);
    	cs.add(c2);
    	
    	
    	
    	App a=new App();
        //System.out.println( a.getcustomer(cs));
    }
}
