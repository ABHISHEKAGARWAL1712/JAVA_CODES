import java.util.Scanner;
class A
{
    int a=9, b=12;
    void sum()
    {
        System.out.println(a+b);
    }
}
class B extends A
{
    void sub()
    {
        System.out.println(a-b);
    }
}
class exp_4_1
{
    public static void main(String args[])
    {
        System.out.println("Hello_World");
        B ob=new B();
        ob.sum();
        ob.sub();
    }
}


