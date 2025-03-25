package newSpring;
import newSpring.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import io.micrometer.common.lang.Nullable;

public class CustDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void createCustomer(Customer cst)
	{
		String sql="insert into customer1(cst_name,cst_type) values('"+cst.getName()+"','"+cst.getType()+"')";
		 jdbcTemplate.execute(sql);
		
	}
	
	public void setCustomer(Customer cst)
	{
		String sql1="update customer1 set cst_name='"+cst.getName()+"' where id=1";
		jdbcTemplate.execute(sql1);
	}
	
	public void delCustomer(Customer cst)
	{
		String sql2="delete from customer1 where id=4";
		jdbcTemplate.execute(sql2);
	}
	
	public List<Customer> getAllCustomers()
	{
		return jdbcTemplate.query("select * from customer1",new ResultSetExtractor<List<Customer>>()
				{
			@Override
			public @Nullable List<Customer> extractData(ResultSet rs) throws SQLException,DataAccessException{
			
			List<Customer> listData=new ArrayList<>();
			while(rs.next())
			
			{
				
				Customer obj=new Customer();
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setType(rs.getString(3));
				listData.add(obj);
				
				
			}
			
			
			return listData;
				
			}
				});
	}
}
