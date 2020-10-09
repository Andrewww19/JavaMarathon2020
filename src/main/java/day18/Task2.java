package day18;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        long x = 7L;
        System.out.println(count7(x));
    }

    public static int count7(long number) {
        int counter = 0;
        if (number > 1) {
            if (number % 10 == 7) {
                counter++;
            }
            return counter + count7(number / 10);
        }
        return 0;
    }
}
