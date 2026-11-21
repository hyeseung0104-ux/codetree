import java.util.Scanner;
public class Main {
    static int[][] grid;
    static int max, n;

    static int count(int r, int c) {
        int cnt = 0;

        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if (grid[i][j] == 1) {
                    cnt++;
                }
            }
        }

       return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        max = 0;
        
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= n-3; i++) {
            for (int j=0; j<=n-3; j++) {
                max = Math.max(max, count(i,j));
            }
        }

        System.out.println(max);
    }
}