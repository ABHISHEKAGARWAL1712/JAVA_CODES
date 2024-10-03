public class detect_double_triple_space_C_L15_4 {
    public static void main(String[] args) {
        String mystring = "this string contain  doubles   and single and  trilpple space";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
    }
}
