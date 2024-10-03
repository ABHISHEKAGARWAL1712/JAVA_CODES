/*WAP to read your name from the Keyboard*/


import java.util.Scanner;
public class readingname {
    public static void main(String args[]){
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// it will read first world of your name
        String name = sc.nextLine();//it will read full name
        System.out.println(str);
        System.out.println(name);
    }

}
