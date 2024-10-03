public class grade_encrypt_decrypt {
    public static void main(String[] args) {
        char grade = 'B';
       grade = (char)(grade + 8);     // type casting   // encrypt
        System.out.println(grade);
        grade= (char)(grade - 8);   // decrypt
        System.out.println(grade );


    }
}
