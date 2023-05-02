package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpDao;
import com.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao empDao;

	@Override
	public void addEmp(Employee e) {

		empDao.addEmp(e);
	}

	@Override
	public List<Employee> allEmp() {
		// TODO Auto-generated method stub
		return empDao.allEmp();
	}

	@Override
	public Employee empbyId(int id) {
		// TODO Auto-generated method stub
		return empDao.empbyId(id);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		empDao.deleteEmp(id);
	}

}
