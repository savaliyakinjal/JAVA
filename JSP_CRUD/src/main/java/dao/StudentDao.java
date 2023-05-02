package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;

public class StudentDao {
	Connection cn = null;

	public StudentDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices","root","test123");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("in exception class cast---" + e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("in exception ---" + e);
		}
	}

	public int addStudent(Student st) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getFname());
			ps.setString(3, st.getLname());
			ps.setString(4, st.getEmail());
			ps.setString(5, st.getPass());
			ps.setString(6, st.getPhno());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Student> getallStudents() {
		ArrayList<Student> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setFname(rs.getString(2));
				st.setLname(rs.getString(3));
				st.setEmail(rs.getString(4));
				st.setPass(rs.getString(5));
				st.setPhno(rs.getString(6));

				al.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}

	public int delete(int id) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public Student getById(int id) {
		Student st = new Student();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from student where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				st.setId(rs.getInt(1));
				st.setFname(rs.getString(2));
				st.setLname(rs.getString(3));
				st.setEmail(rs.getString(4));
				st.setPass(rs.getString(5));
				st.setPhno(rs.getString(6));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public int UpdateStudent(Student st) {
		int i = 0;

		try {
			PreparedStatement ps = cn
					.prepareStatement("update student set fname=?,lname=?,email=?,pass=?,phno=? where id=?");
			ps.setInt(6, st.getId());
			ps.setString(1, st.getFname());
			ps.setString(2, st.getLname());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPass());
			ps.setString(5, st.getPhno());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	
	public boolean logincheck(Student std) {
		boolean b = false;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student where email=? and pass=?");
			ps.setString(1, std.getEmail());
			ps.setString(2, std.getPass());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = true;
			} else {
				b = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
}
