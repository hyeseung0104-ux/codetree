import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N(격자 크기)과 M(점의 개수) 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        // N x N 격자 배열 생성 (Java의 int 배열은 자동으로 0으로 초기화됨)
        int[][] grid = new int[n][n];

        // M개의 점을 입력받아 순서대로 격자에 표시
        for (int i = 1; i <= m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            // 문제에서 r, c는 1부터 시작하므로 배열 인덱스에 맞게 -1씩 빼줌
            grid[r - 1][c - 1] = i;
        }

        // 완성된 격자 상태 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }
        
        sc.close();
    }
}