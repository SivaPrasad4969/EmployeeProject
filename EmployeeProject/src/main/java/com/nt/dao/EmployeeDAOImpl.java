package com.nt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
@Autowired
SessionFactory factory;
Session session=null;
Transaction tx=null;
	@Override
	public Employee insert(Employee emp) {
		session=factory.openSession();
		tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		return emp;
	}


	@Override
	public List<Employee> getEmployee() {
      session=factory.openSession();
      @SuppressWarnings("unchecked")
	List<Employee> list=session.createCriteria(Employee.class).list();
      session.close();
		return list;
	}


	@Override
	public boolean deleteEmp(int id) {
		session = factory.openSession();
		Object o = session.load(Employee.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}
}
