package FizzBuzz;

public class FizzBuzzExample {
    public static void main(String[] args) {
        short[] array = new short[100];
        fillArray(array);
        fizzBuzzCheck(array);

    }

    public static void fillArray(short[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (short) (i + 1);
        }
    }

    public static void fizzBuzzCheck(short[] array) {
        for (short value : array) {
            if (value % 3 == 0 & value % 5 == 0) {
                System.out.println("Fizz&Buzz");
            } else if (value % 5 == 0) {
                System.out.println("Buzz");
            } else if (value % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(value);
            }
        }
    }
}
