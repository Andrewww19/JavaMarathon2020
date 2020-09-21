package day1;

public class Task5 {
	public static void main(String[] args) {
		int year = 1980;
		int limit = 2020;
		for (; year <= limit; year += 4) {
			System.out.printf("Олимпиада %d года", year);
			System.out.println();
		}
	}
}
