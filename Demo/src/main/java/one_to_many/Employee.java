package one_to_many;

import java.util.List;

public class Employee {

	int eid;
	String name;
	List<String> address;

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

}
