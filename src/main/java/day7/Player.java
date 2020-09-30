package day7;

import java.util.Random;

public class Player {
	private int stamina;
	private static final int MAX_STAMINA = 100;
	private static final int MIN_STAMINA = 0;
	private static int countPlayers = 0;

	public Player() {
		this.stamina = new Random().nextInt(11) + 90;
		if (countPlayers < 6) {
			countPlayers++;
		}
	}

	public int getStamina() {
		return stamina;
	}

	public static int getCountPlayers() {
		return countPlayers;
	}

	public void run() {
		if (this.stamina > MIN_STAMINA) {
			this.stamina -= 1;
		} else {
			countPlayers--;
			return;
		}
	}

	public static void info() {
		if (countPlayers < 6) {
			System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
		} else {
			System.out.println("Мест в командах больше нет");
		}
	}
}
