package com.test.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;
import com.test.model.Employees;

@Repository
@Service
public class EmployeeService implements EmployeeDao
{

	private static Employees empData=new Employees();
	static
	{
		empData.getEmpList().add(new Employee(1,"Rohit","MI"));
		empData.getEmpList().add(new Employee(2,"Rahul","DC"));
		empData.getEmpList().add(new Employee(3,"Virat","RCB"));
		empData.getEmpList().add(new Employee(4,"Shreyas","PBKS"));
		empData.getEmpList().add(new Employee(5,"Gill","GT"));
		empData.getEmpList().add(new Employee(6,"Axar","DC"));
	}
	
	//create
	@Override
	public Employee createEmployee(Employee emp)
	{
		empData.getEmpList().add(emp);
		return emp;
	}
	
	//read employee list
	@Override
	public List<Employee> readAllEmployees()
	{
		return empData.getEmpList();
	}
	
	
	///update employee based on id
	@Override	
	public String updateEmployee(Employee emp)
	{
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee e=empData.getEmpList().get(i);
			if(e.getId().equals(emp.getId()))
			{
				empData.getEmpList().set(i, emp);
			}
		}
		
		return "the given id is not available";
	}
	
	//delete employee based on id
	@Override	
	public String  deleteEmployee(Integer id)
	{
		
		
		for(int i=0;i<empData.getEmpList().size();i++)
		{
			Employee emp=empData.getEmpList().remove(i);
		}
		return "the given id is not available";
	}
}
