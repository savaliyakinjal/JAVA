package Task_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class M010_HashMap {

	public static void main(String[] args) {

		HashMap<Integer, Employee> empList = new HashMap<>();
		Scanner s = new Scanner(System.in);

		int ch;
		int empId = 0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add");
			System.out.println("2.View");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("5.Sorting by age");
			System.out.print("Enter your choice :");
			ch = s.nextInt();

			switch (ch) {
			case 1:

				empId++;

				System.out.print("Enter Employee Name :");
				String empName = s.next();

				System.out.print("Enter Employee Skill :");
				String empSkill = s.next();

				System.out.print("Enter Empsalary Age :");
				int empAge = s.nextInt();

				System.out.print("Enter Employee Salary :");
				int empSalary = s.nextInt();

				System.out.print("Enter joiningDate(DD/MM/YY) :");
				String joiningDate = s.next();

				empList.put(empId, new Employee(empName, empSkill, empAge, empSalary, joiningDate));

				System.out.println();
				break;
			case 2:
				System.out.println("****************************");

				for (Entry<Integer, Employee> entry : empList.entrySet()) {

					System.out.println(entry.getKey() + " " + entry.getValue());

				}

				break;
			case 3:
				boolean found = false;
				System.out.print("Enter empId to Delete :");
				empId = s.nextInt();

				empList.remove(empId);
				if (!found) {
					System.out.println("Employee Data Not available...");
				} else {
					System.out.println("Employee Data Delete Successfully....");
				}
				break;
			case 4:
				found = false;
				System.out.print("Enter empId to Update :");
				empId = s.nextInt();

				for (Entry<Integer, Employee> entry : empList.entrySet()) {

					if (entry.getKey() == empId) {

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

						empList.replace(empId, new Employee(empName, empSkill, empAge, empSalary, joiningDate));

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
				for (int j = 1; j <=empList.size(); j++) {
					for (int k = 1; k <=empList.size(); k++) {
						Employee e = empList.get(j);
						Employee e1 = empList.get(k);
						
					
						if (e.empAge < e1.empAge) {
							temp = empList.get(j);
							empList.replace(j, empList.get(k));
							empList.replace(k, temp);
						}
					}
				}
				for (Entry<Integer, Employee> entry : empList.entrySet()) {

					System.out.println(entry.getKey() + " " + entry.getValue());

				}

				break;

			}

		} while (ch != 0);
	}
}
