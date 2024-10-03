import java.util.Scanner;
class lowercase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to convert in lowercase");
        String name = sc.nextLine();
        String lower = name.toLowerCase();
        System.out.println(lower);
    }
}
