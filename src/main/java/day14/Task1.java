package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Task1 {
    public static void main(String[] args) {
        String path = "src\\main\\java\\day14\\text";
        printSumDigits(new File(path));
    }
    public static int printSumDigits(File file) {
        int result = 0;
        int counter = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                result += sc.nextInt();
                counter++;
            }
            if (counter != 10) {
                throw new IOException();
            }
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            e.printStackTrace();
        }
        return result;
    }
}
