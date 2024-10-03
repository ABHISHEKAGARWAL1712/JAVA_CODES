
// this package is used for scanner class
import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // this is scanner class
        System.out.println("enter the integer number");
        int a = sc.nextInt(); // this is used to take integer numner input
        System.out.println(a);

        System.out.println("Enter the float number");
        float f = sc.nextFloat(); // this is used to take the float number input
        System.out.println(f);

        // System.out.println("enter the string");
        // String str = sc.next(); // this is used for taking a single word of the line
        // System.out.println(str);

        System.out.println("enter the full line");
        String str1 = sc.nextLine(); // this is used for taking a full line
        System.out.println(str1);

    }
}
