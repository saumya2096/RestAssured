package Day1;

import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private String programme;
	private List<String> course;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourses(List<String> courses) {
		this.course = courses;
	}

}
