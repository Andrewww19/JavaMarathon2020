package day6;

public class Teacher {
	private String name;
	private String course;

	public Teacher(String name, String course) {
		this.name = name;
		this.course = course;
	}

	public void evaluate(Student student, int grade) {
		if (grade < 2 || grade > 5) {
			System.out.println("Неправильная оценка");
			return;
		}
		String gradeWord;
		if (grade == 2) {
			gradeWord = "неудовлетворительно";
		} else if (grade == 3) {
			gradeWord = "удовлетворительно";
		} else if (grade == 4) {
			gradeWord = "хорошо";
		} else {
			gradeWord = "отлично";
		}
		System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
				+ " по предмету " + this.course + " на оценку " + gradeWord + ".");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
