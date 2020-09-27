package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    	Random random = new Random();
    	int m = 12;// rows
    	int n = 8;// columns
    	int[][] myArr = new int[m][n];
    	int maxValue = 0;
    	int rowAmount = 0;
    	int rowIndex = 0;
    	for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				myArr[i][j] = random.nextInt(50);
				rowAmount += myArr[i][j];
			}
			if (maxValue < rowAmount) {
				maxValue = rowAmount;
				rowIndex = i;
			}
			rowAmount = 0;
		}
    	
System.out.println("Answer is: " + rowIndex);
    }
}
