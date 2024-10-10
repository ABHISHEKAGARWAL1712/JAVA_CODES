import java.util.Scanner;

public class VineyardPartition {

    // Global variables to store the vineyard and its size
    static int n;
    static boolean[][] visited;

    // DFS function to explore the connected components
    public static void dfs(String[] rows, int row, int col) {
        if (row < 0 || row > 1 || col < 0 || col >= n || visited[row][col] || rows[row].charAt(col) == 'x') {
            return;
        }
        visited[row][col] = true;
        dfs(rows, row, col - 1); // left
        dfs(rows, row, col + 1); // right
        dfs(rows, 1 - row, col); // across the row
    }

    // Function to count the number of plots in the vineyard
    public static int countPlots(String[] rows) {
        visited = new boolean[2][n];
        int plotCount = 0;

        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < n; c++) {
                if (!visited[r][c] && rows[r].charAt(c) == 'o') {
                    plotCount++;
                    dfs(rows, r, c);
                }
            }
        }
        return plotCount;
    }

    // Function to count the number of healthy vines that are critical
    public static int countCriticalVines(String[] vineyard) {
        n = vineyard[0].length();

        // Initial plot count
        int initialPlots = countPlots(vineyard);

        if (initialPlots != 1) {
            return 0; // If already split into multiple plots, no vine is critical
        }

        int criticalCount = 0;

        // Check each vine by infecting it and seeing if it splits into 3 plots
        for (int i = 0; i < n; i++) {
            if (vineyard[0].charAt(i) == 'o') {
                String[] newVineyard = { vineyard[0].substring(0, i) + 'x' + vineyard[0].substring(i + 1),
                        vineyard[1] };
                if (countPlots(newVineyard) == 3) {
                    criticalCount++;
                }
            }
            if (vineyard[1].charAt(i) == 'o') {
                String[] newVineyard = { vineyard[0],
                        vineyard[1].substring(0, i) + 'x' + vineyard[1].substring(i + 1) };
                if (countPlots(newVineyard) == 3) {
                    criticalCount++;
                }
            }
        }

        return criticalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); // consume the newline
        String[] vineyard = new String[2];
        vineyard[0] = sc.nextLine();
        vineyard[1] = sc.nextLine();

        // Calculate and print the result
        int result = countCriticalVines(vineyard);
        System.out.println(result);
    }
}
