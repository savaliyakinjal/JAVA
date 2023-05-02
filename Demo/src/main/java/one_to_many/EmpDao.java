package one_to_many;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	Connection cn = null;

	public EmpDao() {

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
			PreparedStatement ps = cn.prepareStatement("insert into emp values(?,?)");

			ps.setInt(1, 0);
			ps.setString(2, emp.getName());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int getEmployeeId(String name) {
//		Employee emp = new Employee();
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("select eid from emp where ename=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			i = rs.getInt(1);
//			emp.setEid(rs.getInt(1));
//			emp.setName(rs.getString(2));
			System.out.println("i (getempid )= " + i);
//			while (rs.next()) {	
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
