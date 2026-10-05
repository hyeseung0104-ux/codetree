import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 격자 크기
        int m = sc.nextInt(); // 점의 개수

        int[][] grid = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            grid[r][c] = r * c;
        }

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}