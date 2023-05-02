package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
	int departmentId;
	String departmentName;
	private int empNo;
	private String empName;
	private int salary;
	private String email;



	public Employee(String departmentName, int empNo, String empName, int salary, String email) {
		super();
		
		this.departmentName = departmentName;
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
	}

	public int getempNo() {
		return empNo;
	}

	public String getempName() {
		return empName;
	}

	public int getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

	public int getdepartmentId() {
		return departmentId;
	}

	public void setdepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [departmentId=" + departmentId + ", empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", email="
				+ email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId, departmentName, email, empName, empNo, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return departmentId == other.departmentId && Objects.equals(departmentName, other.departmentName)
				&& Objects.equals(email, other.email) && Objects.equals(empName, other.empName) && empNo == other.empNo
				&& salary == other.salary;
	}

	
	
}

public class Emp_CRUD {

	public static void main(String[] args) {

		HashSet<Employee> empSet = new HashSet<Employee>();
		Scanner s = new Scanner(System.in);
		
		Department d = new Department();
		HashMap<Integer, String> departmentSet = d.department();

		int ch;
		String email_val = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		do {
			System.out.println("1.Add");
			System.out.println("2.View");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.print("Enter your choice :");
			ch = s.nextInt();

			switch (ch) {
			case 1:
				

				for (Map.Entry m : departmentSet.entrySet()) {
					System.out.println(m.getKey() + " " + m.getValue());
				}

				System.out.print("Enter Department id :");
				int departmentNo = s.nextInt();
				String departmentName=departmentSet.get(departmentNo);
				
				

				System.out.print("Enter empNo :");
				int empNo = s.nextInt();

				System.out.print("Enter Empname :");
				String empName = s.next();

				System.out.print("Enter Empsalary :");
				int salary = s.nextInt();

				System.out.print("Enter Email :");
				String email = s.next();

				Pattern pattern = Pattern.compile(email_val);
				Matcher matcher = pattern.matcher(email);

				if (matcher.matches() == true) {
					empSet.add(new Employee(departmentName,empNo, empName, salary, email));
				} else {
					System.out.println("Invalid Email");
				}

				System.out.println();
				break;
			case 2:
				System.out.println("****************************");
				Iterator<Employee> i = empSet.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
					System.out.println("****************************");
				}
				break;
			case 3:
				boolean found = false;
				System.out.print("Enter empNo to Delete :");
				empNo = s.nextInt();

				i = empSet.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getempNo() == empNo) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Employee Data Not available...");
				} else {
					System.out.println("Employee Data Delete Successfully....");
				}
				break;
			case 4:
				found = false;
				System.out.print("Enter empNo to Update :");
				empNo = s.nextInt();

				Iterator<Employee> li = empSet.iterator();
//				i = c.iterator();
				while (li.hasNext()) {
					Employee e = li.next();
					if (e.getempNo() == empNo) {
						for (Map.Entry m : departmentSet.entrySet()) {
							System.out.println(m.getKey() + " " + m.getValue());
						}

						System.out.print("Enter Department id :");
						departmentNo = s.nextInt();
						departmentName=departmentSet.get(departmentNo);
						System.out.print("Enter Empname :");
						empName = s.next();
						System.out.print("Enter EmpSalary :");
						salary = s.nextInt();
						System.out.print("Enter Email :");
						email = s.nextLine();
						li.remove();
						empSet.add(new Employee(departmentName,empNo, empName, salary, email));
						found = true;
					}
				}
				if (!found) {
					System.out.println("Employee Data Not available...");
				} else {
					System.out.println("Employee Data Update Successfully....");
				}
				break;

			}

		} while (ch != 0);
	}
}
