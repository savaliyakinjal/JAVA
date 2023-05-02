package model;

import java.util.Date;
public class User {

	int userid;
	String firstName;
	String lastName;
	Date dob;
	String email;
	public int getUserid() {
		return userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Date getDob() {
		return dob;
	}
	public String getEmail() {
		return email;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", email=" + email + "]";
	}
	
	
	
}
