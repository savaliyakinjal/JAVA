package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Adddata {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cid :");
		int cid = sc.nextInt();
		System.out.print("Enter the cname:");
		String cname = sc.next();
		System.out.print("Enter the address :");
		String address = sc.next();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practices","root","test123");

			System.out.println("Connection Established.....");
//			jdbc:mysql://localhost:3306/?user=root
			PreparedStatement ps = cn.prepareStatement("insert into customer values(?,?,?)");
			ps.setInt(1, cid);
			ps.setString(2, cname);
			ps.setString(3, address);
			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("data Add......");
			}
			sc.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
