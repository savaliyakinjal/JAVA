package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Skills;

public class SkillsDao {

	Connection cn = null;

	public SkillsDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/practices?enabledTLSProtocols=TLSv1.2&useSSL=false", "root",
					"test123");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public int addSkills(Skills skills) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into skills values(?,?,?)");
			ps.setInt(1, 0);
			ps.setInt(2, skills.getEmployeeId());
			ps.setString(3, skills.getSkill());

			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public void addSkill(List<Skills> list) {
		try {
			PreparedStatement ps = cn.prepareStatement("insert into skills values(?,?,?)");

			for (Skills skills : list) {
				ps.setInt(1, 0);
				ps.setInt(2, skills.getEmployeeId());
				ps.setString(3, skills.getSkill());
				ps.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
