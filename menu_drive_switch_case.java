import java.util.Scanner;
import java.lang.*;
public class menu_drive_switch_case {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("second number");
        int b = sc.nextInt();
        System.out.println("enter the arthimetic");
        String str = sc.next();
        switch(str)
        {
            case "Add":
                int sum = a+b;
                System.out.println(sum);
                break;
            case "Sub":
                int subtr = a-b;
                System.out.println(subtr);
                break;
            default:
                System.out.println("invalid ");
                break;

        }

    }
}
