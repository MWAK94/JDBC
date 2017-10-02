package inheritance;

public class OnCampusStudent extends Student {

	private String city;

	public OnCampusStudent(String onCampName, String onCampStID) {
		super(onCampName, onCampStID);
	}

	public String toString() {
		return "On-Campus Student name:" + getName() + " | Student id:" + getStudentID() + " | City:" + city;
	}

	@Override
	public void attendAClass() {
		System.out.println("On-Campus-Student attending the class in person");
	}

	public void attendAClass(boolean online) {
		if (online)
			System.out.println("On-Campus-Student attending the class through webinar");
		else
			attendAClass();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
