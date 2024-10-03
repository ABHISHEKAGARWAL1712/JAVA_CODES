/*WAP tp enter two number taking input from the user*/
import java.util.Scanner;
public class readdatafromuser {
    public static void main(String args[]){
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
       // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("enter the second number");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum = a+b;
        float sum = a+b;
        System.out.println("The sum of these number");
        System.out.println(sum);
    }
}
