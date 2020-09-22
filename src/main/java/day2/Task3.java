package day2;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));

		try {
			a = scanner.nextInt();
			b = scanner.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Вы ввели не число!");// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Вы ввели не число!");// TODO: handle exception
		}
		if (a > b) {
			System.out.println("Первое число больше второго!");
			return;
		}

		while (a < b - 1) {
			a++;
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.print(a + " ");
			}
		}

	}
}
