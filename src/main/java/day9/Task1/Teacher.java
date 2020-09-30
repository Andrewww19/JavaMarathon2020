package day9.Task1;

public class Teacher extends Human{
	private String course;

	public Teacher(String name, String course) {
		super(name);
		this.course = course;
	}
	
	

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Этот преподаватель с именем " + getName());
	}



	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
