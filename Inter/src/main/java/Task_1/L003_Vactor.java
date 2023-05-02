package Task_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class L003_Vactor {

	public static void main(String[] args) {

		Vector<Employee> employee = new Vector<>();

		Scanner s = new Scanner(System.in);

		int ch;
		int empId = 0;
		do {
			System.out.println("0.Exit.");
			System.out.println("1.Add.");
			System.out.println("2.View.");
			System.out.println("3.Delete.");
			System.out.println("4.Update.");
			System.out.println("5.Sorting by age.");
			System.out.print("Enter your choice :");
			ch = s.nextInt();
			switch (ch) {
			case 1:

				empId++;
				System.out.print("Enter your Name :");
				String empName = s.next();

				System.out.print("Enter your Skill :");
				String empSkill = s.next();

				System.out.print("Enter your Age :");
				int empAge = s.nextInt();

				System.out.print("Enter your Salary :");
				double empSalary = s.nextDouble();

				System.out.print("Enter your joiningDate(DD/MM/YY) :");
				String joiningDate = s.next();

				employee.add(new Employee(empId, empName, empSkill, empAge, empSalary, joiningDate));

				break;
			case 2:

				System.out.println("****************************");
				Iterator<Employee> i = employee.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
					System.out.println("****************************");
				}
				break;
			case 3:
				boolean found = false;
				System.out.print("Enter empId to Delete :");
				empId = s.nextInt();

				i = employee.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpId() == empId) {
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
				empId = s.nextInt();

				i = employee.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpId() == empId) {

						System.out.print("Enter Employee Name :");
						empName = s.next();

						System.out.print("Enter Employee Skill :");
						empSkill = s.next();

						System.out.print("Enter Empsalary Age :");
						empAge = s.nextInt();

						System.out.print("Enter Employee Salary :");
						empSalary = s.nextInt();

						System.out.print("Enter joiningDate(DD/MM/YY) :");
						joiningDate = s.next();

						employee.set((empId - 1),
								new Employee(empId, empName, empSkill, empAge, empSalary, joiningDate));

						found = true;
					}
				}
				if (!found) {
					System.out.println("Employee Data Not available...");
				} else {
					System.out.println("Employee Data Update Successfully....");
				}
				break;
			case 5:
				System.out.println("****************************");
				Employee temp;
				for (int j = 0; j < employee.size(); j++) {
					for (int k = 0; k < employee.size(); k++) {
						Employee e = employee.get(j);
						Employee e1 = employee.get(k);
						
						if (e.empAge<e1.empAge) {
							temp=employee.get(j);
							employee.set(j, employee.get(k));
							employee.set(k, temp);
						}
					}
				}
				i=employee.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
					System.out.println("****************************");
				}
				
				
				break;
			}
		}while(ch!=0);
}}
