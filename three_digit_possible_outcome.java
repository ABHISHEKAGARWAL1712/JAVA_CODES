2/*Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.  
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
*/
import java.util.Scanner;
class three_digit_possible_outcome
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        

        int a[]=new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the"+" "+(i+1)+" digit of the number");
            a[i]=sc.nextInt();
        }
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 3; y++)
            {
                for (int z = 0; z < 3; z++)
                {
                    if (x!= y && y!= z && z!= x)
                    {
                        System.out.println(a[x] + "" + a[y] + "" + a[z]);
                    }
                }
            }
        }
    }
}
