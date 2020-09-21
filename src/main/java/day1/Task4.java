package day1;

public class Task4 {
	public static void main(String[] args) {
		int year = 1980;
		int limit = 2020;
		while (year <= limit) {
			System.out.printf("Олимпиада %d года", year);
			System.out.println();
			year += 4;
		}
	}
}
