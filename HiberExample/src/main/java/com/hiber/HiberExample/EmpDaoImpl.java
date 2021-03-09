package com.hiber.HiberExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmpDaoImpl {

	@Autowired
	SessionFactory sessionFactory;
	
	public void addEmployee(Employee emp) {
		Session session  = sessionFactory.getCurrentSession();
		session.save(emp);
	}
	
	public Employee  getEmployee(long id) {
		Session session  = sessionFactory.getCurrentSession();
		return session.get(Employee.class, id);
	}
}
