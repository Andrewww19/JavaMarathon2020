package day7;

public class Player {
	private int stamina;
	private static final int MAX_STAMINA = 100;
	private static final int MIN_STAMINA = 0;
	private static int countPlayers = 0;

	public Player(int stamina) {
		this.stamina = stamina;
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
//		System.out.println("Player is running...");
		if (this.stamina > MIN_STAMINA + 1) {
			this.stamina -= 1;
		} else {
			this.stamina -= 1;
			countPlayers--;
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
