import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static boolean[] visited;
    static int n;
    static ArrayList<Integer> answer = new ArrayList<>();

    static void choose(int currNum) {
        if (currNum == n+1) {
            printAnswer();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            answer.add(i);

            choose(currNum+1);

            answer.remove(answer.size() -1);
            visited[i] = false;
        }

        return;
    }

    public static void printAnswer() {
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n+1];

        choose(1);
    }
}