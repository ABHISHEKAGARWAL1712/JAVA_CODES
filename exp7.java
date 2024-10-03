import java.util.Scanner;

public class Seven5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = inp.nextLine();

        System.out.print("Enter age: ");
        int ag = inp.nextInt();

        try{
            if(ag > 50) {
                throw new Exception();
            }
            Employee ep = new Employee(n, ag);
            ep.Display();
        } catch(Exception e) {
            System.out.println("\t!Check the details!");
        }
    }
}

class Employee {
    String name;
    int age;

    Employee(String nm, int ag) throws Exception {
        this.name = nm;
        this.age = ag;
    }

    public void Display() {
        System.out.println();
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
