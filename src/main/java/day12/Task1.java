package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carsList = new ArrayList<String>();
        carsList.add("BMW");
        carsList.add("Audi");
        carsList.add("Mercedes");
        carsList.add("Toyota");
        carsList.add("Ford");        
        System.out.println(carsList);
        carsList.add(3, "Tesla");
        carsList.remove(0);
        System.out.println(carsList);
        
    }
}
