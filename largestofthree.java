import java.util.Scanner;
        class largest
        {
            public static void main(String[] args)
            {
                int a, b, c, largest, temp;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first number");
                a = sc.nextInt();
                System.out.println("Enter the second number");
                b = sc.nextInt();
                System.out.println("Enter the third number");
                c = sc.nextInt();
                temp = a>b ? a:b;
                largest = temp>c ? temp:c;
                System.out.println("largest number is" + largest);

            }
        }
