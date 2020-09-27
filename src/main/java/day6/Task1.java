package day6;

public class Task1 {
	public static void main(String[] args) {
		Car car = new Car();
		Motorbike moto = new Motorbike("Bajaj", "Green", 2018);
		car.setYearOfProduction(1980);

		car.info();
		System.out.println(car.yearDifference(2020));
		moto.info();
		System.out.println(moto.yearDifference(2020));
	}
}
