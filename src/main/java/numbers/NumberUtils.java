package numbers;

public class NumberUtils {
    public static boolean isZero(int number) {
        return number == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isZero(4));
        System.out.println(isPositive(-2));
        System.out.println(isEven(102));
    }
}
