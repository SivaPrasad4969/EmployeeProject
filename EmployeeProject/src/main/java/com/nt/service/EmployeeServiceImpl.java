package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.model.Employee;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeDAO employeeDAO;
	@Override
	public Employee insert(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDAO.insert(emp);
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee();
	}

}
