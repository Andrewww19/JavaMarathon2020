package day3;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws IOException {
		String inputText = "";
		Scanner scanner = new Scanner(System.in);
		
		while (!inputText.equals("Stop")) {
			inputText = scanner.nextLine();
			switch (inputText) {
			case ("Москва"):
			case ("Владивосток"):
			case ("Ростов"):
				System.out.println("Россия");
				break;
			case ("Рим"):
			case ("Милан"):
			case ("Турин"):
				System.out.println("Италия");
				break;
			case ("Ливерпуль"):
			case ("Манчестер"):
			case ("Лондон"):
				System.out.println("Англия");
				break;
			case ("Берлин"):
			case ("Мюнхен"):
			case ("Кёльн"):
				System.out.println("Германия");
				break;
			case ("Stop"):	
				break;
			default:
				System.out.println("Неизвестная страна");
				break;
			}
		}
		scanner.close();
	}
}
