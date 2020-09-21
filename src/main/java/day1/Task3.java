package day1;

public class Task3 {

	public void printWord(String inputText, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(inputText);
		}
	}

	public static void main(String[] args) {
		Task3 solutionTask3 = new Task3();
		solutionTask3.printWord("JAVA", 10);
	}
}
