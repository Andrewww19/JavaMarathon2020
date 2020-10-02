package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Picker picker = new Picker(warehouse);
        Picker picker2 = new Picker(warehouse2);
        Courier courier = new Courier(warehouse);
        Courier courier2 = new Courier(warehouse2);

        
        while (warehouse.getCountOrder() < 1500) {
            picker.doWork();
        }
        while (warehouse.getBalance() < 1000000) {
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
        System.out.println(warehouse.toString());

        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse2.toString());

        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
        System.out.println(warehouse.toString());
    }
}
