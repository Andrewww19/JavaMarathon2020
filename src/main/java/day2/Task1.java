package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public void determineBuilding(int in) {
		if (in <= 0) {
			System.out.println("Ошибка ввода");
		} else if (in < 5) {
			System.out.println("Малоэтажный дом");
		} else if (in < 9) {
			System.out.println("Среднеэтажный дом");
		} else {
			System.out.println("Многоэтажный дом");
		}
	}

	public static void main(String[] args) {
		String inputText;
		int inputInt;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Task1 task1 = new Task1();
		
		try {
			inputText = bufferedReader.readLine();
			inputInt = Integer.parseInt(inputText);
			task1.determineBuilding(inputInt);
		} catch (IOException e) {
			System.out.println("Некоректный ввод.");// TODO Auto-generated catch block
		} catch (NumberFormatException e) {
			System.out.println("Вы ввели не число.");
		}

		

	}
}
