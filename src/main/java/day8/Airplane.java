package day8;

public class Airplane {
	private String manufacturer;
	private int yearOfProduction;
	private int length;
	private int weight;
	private int fuelQty;

	public Airplane(String manufacturer, int yearOfProduction, int length, int weight) {
		this.manufacturer = manufacturer;
		this.yearOfProduction = yearOfProduction;
		this.length = length;
		this.weight = weight;
	}

	public void info() {
		System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.yearOfProduction
				+ ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuelQty);
	}

	public void fillUp(int qty) {
		this.fuelQty += qty;
	}

	@Override
	public String toString() {
		return "Изготовитель: " + manufacturer + ", год выпуска: " + yearOfProduction + ", длина: "
				+ length + ", вес: " + weight + ", количество топлива в баке: " + fuelQty;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFuelQty() {
		return fuelQty;
	}

	public void setFuelQty(int fuelQty) {
		this.fuelQty = fuelQty;
	}

}
