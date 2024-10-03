import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int minOffDays, maxOffDays;

        if (n <= 5) {
            minOffDays = 0;
            maxOffDays = n;
        } else {
            int weeks = n / 7;
            int remainingDays = n % 7;

            minOffDays = weeks * 2;
            minOffDays += Math.max(0, Math.min(2, remainingDays));

            maxOffDays = weeks * 2;
            maxOffDays += Math.min(2, remainingDays);
        }

        System.out.println(minOffDays + " " + maxOffDays);
    }
}