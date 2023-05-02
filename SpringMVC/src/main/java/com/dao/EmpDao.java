package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmpDao {
	public void addEmp(Employee e);

	public List<Employee> allEmp();

	public Employee empbyId(int id);

	public void deleteEmp(int id);
}
