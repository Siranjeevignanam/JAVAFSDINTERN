package newSpring.main;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import newSpring.CustDao;
import newSpring.Customer;
public class StoreData {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		Customer obj=new Customer();
		obj.setName("Rohan");
		obj.setType("Non-Regular");
		CustDao cst=ctx.getBean("custDao",CustDao.class);
		//cst.createCustomer(obj);
		//cst.setCustomer(obj);
		cst.delCustomer(obj);
		List<Customer> l1=cst.getAllCustomers();
		for(Customer cstd:l1)
		{
			System.out.println(cstd);
		}
		
	}

}
