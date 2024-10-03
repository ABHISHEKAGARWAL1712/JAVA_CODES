import java.lang.*;
import java.util.Scanner;
public class quadratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b, c;
        double r1 , r2;
        System.out.println("enter the three side of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
    }

}
