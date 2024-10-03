interface test{
    void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("square");
    }

}
class Main
{
    public static void main(String[] args) {
        test ob=new arithmetic();
        ob.square();
    }
}

