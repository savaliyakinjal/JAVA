package com.service;

import java.util.List;

import com.model.Employee;

public interface EmpService {

	public void addEmp(Employee e);

	public List<Employee> allEmp();

	public Employee empbyId(int id);

	public void deleteEmp(int id);
}
