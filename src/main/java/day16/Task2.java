package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        writeToFirstFile(file1);
        writeToSeconfFile(file1, file2);
        printResult(file2);
    }

    public static void writeToFirstFile(File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                pw.println(random.nextInt(101));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToSeconfFile(File fileIn, File fileOut) {
        try (Scanner sc = new Scanner(fileIn); PrintWriter pw = new PrintWriter(fileOut)) {
            int counter = 0;
            int result = 0;
            while (sc.hasNext()) {
                result += sc.nextInt();
                counter++;
                if (counter % 20 == 0) {
                    pw.println((double) result / 20);
                    result = 0;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file) {
        try (Scanner sc = new Scanner(file)) {
            double result = 0;
            while (sc.hasNext()) {
                result += Double.parseDouble(sc.next());
            }
            System.out.println((int) result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
