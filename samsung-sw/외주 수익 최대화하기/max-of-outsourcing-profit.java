import java.util.*;
import java.io.*;

public class Main {
    static int[] t;     // 걸리는 기한
    static int[] p;     // 수익
    static int[] best;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        t = new int[n];
        p = new int[n];
        best = new int[n+1];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            best[i] = best[i+1];

            if (i + t[i] <= n) {
                best[i] = Math.max(best[i], p[i]+best[i+t[i]]);
            }
        }

        System.out.println(best[0]);
    }
}