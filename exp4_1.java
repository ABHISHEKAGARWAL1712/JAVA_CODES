public class Four1
{
    public static void main(String[] args) {
          Two o = new Two();
        System.out.println(o.n); //Can't access variable n here
    }
}

class One {
    private int n = 6;
}

class Two extends One {
    int x = 4;
}
