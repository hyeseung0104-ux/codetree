import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        StringBuilder stack = new StringBuilder();
        int m = b.length();

        for (int i = 0; i < a.length(); i++) {
            stack.append(a.charAt(i));

            int size = stack.length();
            if (size < m) {
                continue;
            }

            boolean matches = true;

            for (int j = 0; j < m; j++) {
                if (stack.charAt(size - m + j) != b.charAt(j)) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                stack.setLength(size - m);
            }
        }

        System.out.println(stack);
    }
}