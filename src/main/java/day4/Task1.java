package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
	
	public int[] generateArray(int n) {
		Random random = new Random();
    	int[] arr = new int[n];
    	for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = random.nextInt(11);
		}
    	return arr;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int arrLength = sc.nextInt();
    	Task1 task1 = new Task1();
    	int[] myArr = task1.generateArray(arrLength);
    	int result = 0;
    	
    	System.out.println(Arrays.toString(myArr));
    	
    	for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] > 8) {
				result++;
			}
		}
    	System.out.println(result);
    	result = 0;
    	for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] == 1) {
				result++;
			}
		}
    	System.out.println(result);
    	result = 0;
    	for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] % 2 == 0) {
				result++;
			}
		}
    	System.out.println(result);
    	result = 0;
    	for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] % 2 != 0) {
				result++;
			}
		}
    	System.out.println(result);
    	result = 0;
    	for (int i = 0; i < myArr.length; i++) {
			result += myArr[i];
		}
    	System.out.println(result);
    	sc.close();
    }
}
