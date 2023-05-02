package one_to_many;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressDao {
	Connection cn = null;

	public AddressDao() {

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

	public int addAddress(address add) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into add values(?,?,?)");

			ps.setInt(1, 0);
			ps.setInt(2, add.getEid());
			ps.setString(2, add.getAddress());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
