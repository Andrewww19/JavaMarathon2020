package day6;

public class Motorbike {
	private int yearOfProduction;
	private String color;
	private String model;

	public Motorbike(String model, String color, int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
		this.color = color;
		this.model = model;
	}

	public void info() {
		System.out.println("Это мотоцикл");
	}

	public int yearDifference(int year) {
		return Math.abs(year - this.yearOfProduction);
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

}
