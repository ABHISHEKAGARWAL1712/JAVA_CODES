/*WAP a java program to find the largest of three number*/
import java.util.Scanner;
        class largest
        {
            public static void main(String[] args)
            {
                int a, b, c, largest, temp;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first number");
                a = sc.nextInt();    //Taking input from the user.
                System.out.println("Enter the second number");
                b = sc.nextInt();    //Taking input from the user.
                System.out.println("Enter the third number");
                c = sc.nextInt();    //Taking input from the user.
                temp = a>b ? a:b;    //comparing two values using ternary operator.
                largest = temp>c ? temp:c; //comparing values using ternary operator.
                System.out.println("largest number is" + largest); // printing the largest value.

            }
        }