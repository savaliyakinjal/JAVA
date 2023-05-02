package dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.User;

public class UserDao {
	Connection cn = null;

	public UserDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices?enabledTLSProtocols=TLSv1.2&useSSL=false","root","test123");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int addUser(User user) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into demo values(?,?,?,?,?)");
			
			Date date=user.getDob();
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
			String strDate = dateFormat.format(date);
			
			ps.setInt(1, 0);
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getEmail());
			ps.setString(5, strDate);
		

			i = ps.executeUpdate();

		} catch (SQLException e) {
//			System.out.println("in exception add atudent---" + e);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("in exception add student other then sql..---" + e);
		}
		return i;
	}

	public ArrayList<User> getallUsers() {
		ArrayList<User> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from demo");
			ResultSet rs = ps.executeQuery();

	
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt(1));
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setEmail(rs.getString(4));
				
				
				String Date1=rs.getString(5); 
			    Date date = null;
				try {
					date = (Date) new SimpleDateFormat("dd-MMM-yyyy").parse(Date1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				
				
				user.setDob(date);
				

				al.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}

	public int delete(int id) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from demo where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public User getById(int id) {
		User user = new User();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from demo where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user.setUserid(rs.getInt(1));
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setEmail(rs.getString(4));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public int UpdateUser(User user) {
		int i = 0;

		try {
			PreparedStatement ps = cn
					.prepareStatement("update demo set fname=?,lname=?,email=?,dob=? where id=?");
			
			
			
			ps.setInt(5, user.getUserid());
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
		
			Date date=user.getDob();
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
			String strDate = dateFormat.format(date);
			System.out.println(date);
			System.out.println("strdate : "+strDate);
			ps.setString(4, strDate);
		

			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
