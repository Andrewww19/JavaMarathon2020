package day6;

public class Task2 {
	public static void main(String[] args) {
		Airplane airplane = new Airplane("Antonov", 2018, 22, 10000);
		airplane.info();
		airplane.setYearOfProduction(2017);
		airplane.setLength(23);
		airplane.fillUp(135);
		airplane.info();
		airplane.fillUp(535);
		airplane.info();

	}
}
