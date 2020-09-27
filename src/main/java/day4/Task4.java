package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
    	Random random = new Random();
    	int m = 100;
    	int[] myArr = new int[m];
    	int amount = 0;
    	int maxAmount = 0;
    	int index = 0;
    	
    	for (int i = 0; i < m; i++) {
			myArr[i] = random.nextInt(10000);
		}
    	
    	for (int i = 1; i < myArr.length - 1; i++) {
			amount = myArr[i - 1] + myArr[i] + myArr[i + 1];
			if (amount > maxAmount) {
				maxAmount = amount;
				index = i - 1;
			}
		}
    	System.out.println(maxAmount);
    	System.out.println(index);
    }
}
