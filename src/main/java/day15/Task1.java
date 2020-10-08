package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File readingFile = new File("src//main//resources//shoes.csv");
        File writingFile = new File("src//main//resources//missing_shoes.txt");
        readWriteToFile(readingFile, writingFile);
    }

    public static void readWriteToFile(File inFile, File outFile) {

        try {
            PrintWriter pw = new PrintWriter(outFile);
            Scanner sc = new Scanner(inFile);
            while (sc.hasNext()) {
                String[] arr = sc.nextLine().split(";");
                if (Integer.parseInt(arr[2]) == 0) {
                    pw.println(String.format("%s, %s, %s", arr[0], arr[1], arr[2]));
                }
            }
            sc.close();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
