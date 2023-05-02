package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.Employee;

public class EmployeeDao {

	Connection cn = null;

	public EmployeeDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/practices?enabledTLSProtocols=TLSv1.2&useSSL=false", "root",
					"test123");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int addEmployee(Employee emp) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into employee values(?,?,?,?,?,?)");

			Date date = emp.getJoiningDate();
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			String joinDate = dateFormat.format(date);

			ps.setInt(1, 0);
			ps.setString(2, emp.getEmpName());
			ps.setString(3, emp.getSkill());
			ps.setInt(4, emp.getAge());
			ps.setDouble(5, emp.getSalary());
			ps.setString(6, joinDate);

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Employee> getallEmployee() {
		ArrayList<Employee> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSkill(rs.getString(3));
				employee.setAge(rs.getInt(4));
				employee.setSalary(rs.getDouble(5));

				String Date1 = rs.getString(6);
				Date date = null;
				try {
					date = (Date) new SimpleDateFormat("dd-MMM-yyyy").parse(Date1);
				} catch (ParseException e) {
					System.out.println("Error -- " + e);
				}

				employee.setJoiningDate(date);

				al.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}

	public int delete(int id) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from employee where eid=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public Employee getById(int id) {
		Employee employee = new Employee();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				employee.setEmployeeId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSkill(rs.getString(3));
				employee.setAge(rs.getInt(4));
				employee.setSalary(rs.getDouble(5));
				String Date1 = rs.getString(6);
				Date date = null;
				try {
					date = (Date) new SimpleDateFormat("dd-MMM-yyyy").parse(Date1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				employee.setJoiningDate(date);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	public int UpdateEmployee(Employee employee) {
		int i = 0;
		System.out.println("In Update Dao......");
		try {
			PreparedStatement ps = cn
					.prepareStatement("update employee set ename=?,skills=?,age=?,salary=?,joiningdate=? where eid=?");

			Date date = employee.getJoiningDate();
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			String joinDate = dateFormat.format(date);

			ps.setInt(6, employee.getEmployeeId());
			ps.setString(1, employee.getEmpName());
			ps.setString(2, employee.getSkill());
			ps.setInt(3, employee.getAge());
			ps.setDouble(4, employee.getSalary());
			ps.setString(5, joinDate);

			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
