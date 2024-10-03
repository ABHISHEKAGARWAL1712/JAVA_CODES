
public class string_method {
    public static void main(String[] args) {
        String name = "Abhishek";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lower = name.toLowerCase();
        System.out.println(lower);
        String upper = name.toUpperCase();
        System.out.println(upper);
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,8));
        System.out.println(name.replace('h','g'));
        System.out.println(name.replace("A","ier"));
        System.out.println(name.startsWith("ab"));
        System.out.println(name.startsWith("Ab"));
        System.out.println(name.endsWith("ek"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("bhi"));
        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf('h',3 ));
        System.out.println(name.lastIndexOf('h'));
        System.out.println(name.lastIndexOf('h',4));
        System.out.println(name.equals("abhishek"));
        System.out.println(name.equals("Abhishek"));
        System.out.println(name.equalsIgnoreCase("abhishek"));

        String nontrim = "      agarwal     ";
        System.out.println(nontrim);
        System.out.println(nontrim.trim());

    }
}
