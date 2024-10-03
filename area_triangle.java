import java.util.Scanner;
public class area_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area;
        System.out.println("enter the valure of base of triangle");
        float base = sc.nextFloat();
        System.out.println("enter thw value of height of triangle");
        float height = sc.nextFloat();
        area =1/2f*base*height;
        System.out.println("area of triangle"+area);
    }
}
