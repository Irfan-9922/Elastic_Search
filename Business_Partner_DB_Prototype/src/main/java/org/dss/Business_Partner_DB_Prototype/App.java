package org.dss.Business_Partner_DB_Prototype;

import java.time.ZonedDateTime;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Company c = new Company();
		/**
		 * company to bank @onetomany bank to company @maytoone company to
		 * comment @onetoMany
		 */
		CompanyaBankDetail cbd = new CompanyaBankDetail();
		CompanyaBankDetail cbd1 = new CompanyaBankDetail();
		CompanyComment com = new CompanyComment();
		CompanyComment com1 = new CompanyComment();
		/**
		 * address type 
		 */
		AddressType adtype=new AddressType();
		adtype.setDescription("office address");
		adtype.setId(12L);
		adtype.setWorkflowId(1L);
		
		/**
		 * Adress to company @manyToOne
		 * Adress to Adresstype @manyToOne
		 */
		Address ad=new Address();
		
		ad.setAddressType(adtype);
		ad.setCity("Latur");
		
		ad.setCountryId(123L);
		ad.setFaxNumber("99897");
		ad.setId(123L);
		ad.setName("mahadevi nagar");
		ad.setPhoneNumber("9922865737");
		ad.setStreet1("Stereet one");
		ad.setStreet2("Stereet two");
		ad.setStreet3("Stereet three");
		ad.setZipcode("413512");
		
		
		
		
		
		
		

		c.setClientId(1L);
		c.setCreatedBy(9922L);
		c.setEmailAddress("irfan57@gmail.com");
		c.setHomePage("local.com");
		c.setId(01L);
		c.setLastModifiedBy(9922L);
		c.setMainContactJobTitle("Manager");
		c.setMainContactName("Mujahid");
		c.setName("BoomBurg.pvt.Ltd");
		c.setOptLock(12L);
		c.setSapNo(123L);
		c.setSupplierNo(8989L);
		c.setWorkFlowId(12L);

		cbd.setBankIdentifierCode("IRF");
		cbd.setBankName("HDFC");
		cbd.setCommercialRegisterEntry("commercialregisterEntery");
		cbd.setCompany(c);
		cbd.setCurrencyId(1230L);
		cbd.setId(90L);
		cbd.setInternationBankAccountNo("12345678");
		cbd.setVATIdentityNo("12344");

		cbd1.setBankIdentifierCode("NISar1231");
		cbd1.setBankName("BOI");
		cbd1.setCommercialRegisterEntry("commercialregisterEntery");
		cbd1.setCompany(c);
		cbd1.setCurrencyId(123L);
		cbd1.setId(900L);
		cbd1.setInternationBankAccountNo("12345678");
		cbd1.setVATIdentityNo("2321");

		// map reletion

		c.getBankDetails().add(cbd);
		c.getBankDetails().add(cbd1);

		/**
		 * comment
		 */

		com.setComments("good for service");
		com.setCreatedBy(123L);
		com.setLastModified(null);
		com.setId(9L);
		com.setCompany(c);
		/**
		 * secomd comment
		 */
		com1.setComments("not good");
		com1.setCreatedBy(234L);
		com1.setLastModified(null);
		com1.setId(89L);
		com1.setCompany(c);

		c.getComment().add(com);
		c.getComment().add(com1);
		ad.setCompany(c);
		c.getAdress().add(ad);
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(c);
		session.save(adtype);
		session.getTransaction().commit();
		session.close();

	}
}
