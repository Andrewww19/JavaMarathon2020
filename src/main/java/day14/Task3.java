package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\day14\\people.txt");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> list = new ArrayList<>();
        
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String tmp1 = sc.next();
                int tmp2 = sc.nextInt();
                if (tmp2 < 0) {
                    throw new IOException();
                } else {
                    list.add(new Person(tmp1, tmp2));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            e.printStackTrace();
        }
        
        
        return list;
    }
}
