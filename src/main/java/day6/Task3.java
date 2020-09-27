package day6;

public class Task3 {
	public static void main(String[] args) {
		Student student = new Student("Andrew");
		Teacher teacher = new Teacher("Mr. Bob Martin", "Java programming");

		teacher.evaluate(student, 0);
	}
}
