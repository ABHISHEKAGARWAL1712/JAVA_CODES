/*WAP to calculate percentage of a given student in CBSE board exam. His marks from 5 subject must be taken as input from the keyboard.*/
import java.util.Scanner;
public class percentageofstudent {
    public static void main(String args[]){
        System.out.println("enter the marks of five subject");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of english");
        float m1 = sc.nextFloat();
        System.out.println("enter the marks of the maths");
        float m2 = sc.nextFloat();
        System.out.println("enter the marks of th physics");
        float m3 = sc.nextFloat();
        System.out.println("enter the marks of the chemistry");
        float m4 = sc.nextFloat();
        System.out.println("enter the marks of computer");
        float m5 = sc.nextFloat();
        float totalmarks = m1+m2+m3+m4+m5;
        System.out.println("the total marks of the student is");
        System.out.println(totalmarks);
        float percentage = (totalmarks*100)/5;
        System.out.println("the percentage of the student is");
        System.out.println(percentage);

    }

}
