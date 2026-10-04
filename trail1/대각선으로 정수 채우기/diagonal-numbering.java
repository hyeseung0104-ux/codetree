import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    StringTokenizer st = new StringTokenizer(br.readLine());

                            int n = Integer.parseInt(st.nextToken());
                                    int m = Integer.parseInt(st.nextToken());

                                            int[][] grid = new int[n][m];
                                                    int num = 1;

                                                            // 대각선의 합 k = r + c (0부터 n + m - 2까지)
                                                                    for (int k = 0; k <= n + m - 2; k++) {
                                                                                for (int r = 0; r < n; r++) {
                                                                                                int c = k - r;
                                                                                                                if (c >= 0 && c < m) {
                                                                                                                                    grid[r][c] = num++;
                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                        }

                                                                                                                                                                                // 빠른 출력을 위한 StringBuilder 사용
                                                                                                                                                                                        StringBuilder sb = new StringBuilder();
                                                                                                                                                                                                for (int i = 0; i < n; i++) {
                                                                                                                                                                                                            for (int j = 0; j < m; j++) {
                                                                                                                                                                                                                            sb.append(grid[i][j]).append(j == m - 1 ? "" : " ");
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    sb.append("\n");
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                            System.out.print(sb.toString());
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                