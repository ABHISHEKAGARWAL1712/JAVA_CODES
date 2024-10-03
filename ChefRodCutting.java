import java.util.Scanner;

public class ChefRodCutting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int totalWays = countWays(n);

        System.out.println(totalWays);
    }

    public static int countWays(int n) {
        if (n <= 1)
            return 0;

        // For even n, return n/4 if n is divisible by 4, otherwise return (n/4) - 1
        if (n % 2 == 0) {
            if (n % 4 == 0)
                return n / 4 - 1;
            else
                return n / 4;
        }
        // For odd n, return (n-1)/4
        else {
            return (n - 1) / 4;
        }
    }
}
