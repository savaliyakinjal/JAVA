package model;

public class Skills {

	int skillId;
	int employeeId;
	String skill;

	public Skills(String skill) {
		super();
		this.skill = skill;
	}

	public int getSkillId() {
		return skillId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
