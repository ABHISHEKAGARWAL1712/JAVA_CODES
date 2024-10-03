import java.util.Scanner;

public class radix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2); // it will show the binary number as output
        int x = sc.nextInt();
        System.out.println(x);
    }
}