package day18;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int[] numbers2 = {402, -50, -249, 215, 665, 311};
        int[] numbers3 = {-402, -50, -249, -15, -665, -311};
        
        System.out.println(recursionSum(numbers, numbers.length));
        System.out.println(recursionSum(numbers2, numbers2.length));
        System.out.println(recursionSum(numbers3, numbers3.length));
    }
    public static int recursionSum(int[] numbers, int counter) {
        counter--;
        if(counter < 0) {
            return 0;
        }
        return numbers[counter] + recursionSum(numbers, counter);
    }
}