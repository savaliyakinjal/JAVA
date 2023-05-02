package com;

import java.util.HashMap;

public class Department {

	int departmentId;
	String departmentName;

	public int getdepartmentId() {
		return departmentId;
	}

	public String getdepartmentName() {
		return departmentName;
	}

	public void setdepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public HashMap<Integer, String> department() {
		HashMap<Integer, String> departmentSet = new HashMap<>();

		departmentSet.put(1, "java");
		departmentSet.put(2, "Node Js");
		departmentSet.put(3, "React");
		departmentSet.put(4, "Angular");

		return departmentSet;
		 
	}


}

