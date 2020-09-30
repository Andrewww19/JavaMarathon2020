package day7;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {

		Player player1 = new Player();
		System.out.println(player1.getStamina());
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		Player player5 = new Player();
		Player.info();
		Player player6 = new Player();
		Player.info();
		System.out.println(Player.getCountPlayers());
		Player player7 = new Player();
		System.out.println(Player.getCountPlayers());

		for (int i = player1.getStamina() + 1; i > 0; i--) {
			player1.run();
		}
			
		System.out.println(Player.getCountPlayers());
		System.out.println(player1.getStamina());
		Player.info();

	}
}
