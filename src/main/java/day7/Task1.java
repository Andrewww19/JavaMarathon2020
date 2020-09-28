package day7;

public class Task1 {
	public static void main(String[] args) {
		Airplane plane = new Airplane("Antonov", 1989, 200, 30000);
		Airplane plane2 = new Airplane("Boing", 2009, 170, 25000);

		Airplane.compareAirplanes(plane, plane2);
	}
}