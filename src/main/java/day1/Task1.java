package day1;

public class Task1 {

	public void printWord(String inputText, int times) {
		int i = 0;
		while (i < times) {
			System.out.print(inputText + " ");
			i++;
		}
	}

	public static void main(String[] args) {

		Task1 solutionTask1 = new Task1();
		solutionTask1.printWord("JAVA", 10);
	}
}
