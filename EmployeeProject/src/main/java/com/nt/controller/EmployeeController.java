package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@Controller 
@RequestMapping("employee")
public class EmployeeController {
@Autowired
EmployeeService employeeService;
@RequestMapping(value = "/create", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody Employee Add(@RequestBody Employee emp){
	return employeeService.insert(emp);
	
}
@RequestMapping(value = "/list", method = RequestMethod.GET)
public @ResponseBody
List<Employee> getEmployee() {

	List<Employee> employeeList = null;
	try {
		employeeList = employeeService.getEmployee();

	} catch (Exception e) {
		e.printStackTrace();
	}

	return employeeList;
}
}
