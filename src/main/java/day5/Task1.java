package day5;

public class Task1 {
    public static void main(String[] args) {
    	Car car = new Car();
    	car.setYearOfProduction(1995);
    	car.setColor("red");
    	car.setModel("BMW 525");
    	System.out.println(car.getYearOfProduction());
    	System.out.println(car.getColor());
    	System.out.println(car.getModel());
    }
}
