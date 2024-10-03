import java.util.Scanner;

public class sumdigit {
    public static int sumOfDigits(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphanumeric string");
        String input = sc.next();

        int digitSum = sumOfDigits(input);
        System.out.println("Sum of digits in the string \"" + input + "\": " + digitSum);
    }
}
