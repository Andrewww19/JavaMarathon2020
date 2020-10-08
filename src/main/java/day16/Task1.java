package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "src\\main\\java\\day14\\text";
        printResult(new File(path));
    }
    public static void printResult(File file) {

        try(Scanner sc = new Scanner(file)) {
            int result = 0;
            int counter = 0;
            while(sc.hasNext()) {
                result += sc.nextInt();
                counter ++;
            }
            System.out.print(String.format((double) result / counter + " --> %.3f", (double) result / counter));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
