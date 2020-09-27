package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
    	int[] myArr = new int[100];
    	Random random = new Random();
    	int maxValue = 0;
    	int minValue = 10000;
    	int qtyOfZeroEnded = 0;
    	int amountOfZeroEnded = 0;
    	for (int i = 0; i < myArr.length; i++) {
			myArr[i] = random.nextInt(10000);
		}
    	
    	for(int x : myArr) {
    		if (x > maxValue) {
				maxValue = x;
			}
    	}
    	System.out.println(maxValue);
    	
    	for(int x : myArr) {
    		if (x < minValue) {
				minValue = x;
			}
    	}
    	System.out.println(minValue);
    	
    	for(int x : myArr) {
    		if (x % 10 == 0) {
				qtyOfZeroEnded++;
			}
    	}
    	System.out.println(qtyOfZeroEnded);
    	
    	for(int x : myArr) {
    		if (x % 10 == 0) {
				amountOfZeroEnded += x;
			}
    	}
    	System.out.println(amountOfZeroEnded);
    }
}
