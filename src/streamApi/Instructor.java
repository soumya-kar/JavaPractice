package streamApi;

import java.util.List;

public class Instructor {
	
	String name;
	int experience;
	String designation;
	String gender;
	boolean haveOnlineCourses;
	List<String> courses;
	public Instructor(String name, int experience, String designation, String gender, boolean haveOnlineCourses,
			List<String> courses) {
		super();
		this.name = name;
		this.experience = experience;
		this.designation = designation;
		this.gender = gender;
		this.haveOnlineCourses = haveOnlineCourses;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isHaveOnlineCourses() {
		return haveOnlineCourses;
	}
	public void setHaveOnlineCourses(boolean haveOnlineCourses) {
		this.haveOnlineCourses = haveOnlineCourses;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", experience=" + experience + ", designation=" + designation + ", gender="
				+ gender + ", haveOnlineCourses=" + haveOnlineCourses + ", courses=" + courses + "]";
	}
	
	

}
