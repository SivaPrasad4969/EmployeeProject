package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface EmployeeDAO {
public Employee insert(Employee emp);
public List<Employee> getEmployee();
}
