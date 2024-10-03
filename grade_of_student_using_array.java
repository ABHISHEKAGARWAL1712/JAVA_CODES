/*Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. */
import java.util.Arrays;
import java.util.Scanner;
 class marks {
    public static void main(String args[]) {
        int i , sum=0;
        Scanner input = new Scanner(System.in);
        int num[] = new int[10] ;
        for (i=0;i<num.length;i++) {
            System.out.println("enter the marks of student "+(i+1));
            num[i] = input.nextInt();
        }

        for (i=0;i<num.length;i++){
            Arrays.sort(num);

        }
        for (i=0;i<num.length;i++){
            System.out.println("After sorting your enter marks are :"+num[i]);
        }

        for (i=0;i<num.length;i++){
            if (num[i]>=40 && num[i]<=50)
                System.out.println("Pass :" + num[i]);
            else if (num[i]>=51 && num[i]<=75)
                System.out.println("Merit :" + num[i]);
            else if (num[i]>=76)
                System.out.println("Dic :" + num[i]);
            else
                System.out.println("Fail :" + num[i]);
        }
    }
}

