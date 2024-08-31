package examples.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        Integer number = 222;
        System.out.println("Number: " + number);
        System.out.println("Is palindrome? - " + isPalindrome(number));

        System.out.println("------");

        String string = "Anna";
        System.out.println("A word: '" + string + "'");
        System.out.println("Is palindrome? - " + isPalindrome(string));
    }

    public static boolean isPalindrome(Integer number) {
        String string = number.toString();
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }

    public static boolean isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equalsIgnoreCase(reversed);
    }
}
