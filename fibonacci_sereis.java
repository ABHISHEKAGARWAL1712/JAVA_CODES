/*Write a program to print Fibonacci series using loop.*/
import java.util.Scanner;
class Fibonacci_2
{
    public static void main(String args[])
    {
        int firstTerm = 0, secondTerm=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which you want to print fibonacci series.");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
