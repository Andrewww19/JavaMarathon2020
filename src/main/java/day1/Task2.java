package day1;

public class Task2 {

	public void printWord(String inputText, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(inputText + " ");
		}
	}

	public static void main(String[] args) {
		Task2 solutionTask2 = new Task2();
		solutionTask2.printWord("JAVA", 10);

	}
}
