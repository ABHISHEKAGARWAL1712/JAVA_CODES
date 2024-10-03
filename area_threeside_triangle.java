import java.lang.*;
import java.util.Scanner;
public class area_threeside_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side of triangle");
        int a = sc.nextInt();
        System.out.println("enter the second side of triangle");
        int b = sc.nextInt();
        System.out.println("enter the third side of triangle");
        int c = sc.nextInt();
        float s = ((float)1/2*(a+b+c));
        double area = (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.println(area);
    }
}
