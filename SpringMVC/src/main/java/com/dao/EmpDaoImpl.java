package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Transactional
@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addEmp(Employee e) {

		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(e);
		tx.commit();

	}

	@Override
	public List<Employee> allEmp() {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		return s.createQuery("from Employee").list();
	}

	@Override
	public Employee empbyId(int id) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		return s.get(Employee.class, id);
	}

	@Override
	public void deleteEmp(int id) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Employee e = s.get(Employee.class, id);
		s.delete(e);
		tx.commit();
	}

}
