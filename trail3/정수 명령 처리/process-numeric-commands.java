import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.equals("push")){
                int a = sc.nextInt();
                s.push(a);
            }

            else if (str.equals("size")) {
                System.out.println(s.size());
            }

            else if (str.equals("empty")) {
                if (s.empty())
                    System.out.println(1);
                else 
                    System.out.println(0);
            }

            else if (str.equals("pop")) {
                System.out.println(s.pop());
            }

            else if (str.equals("top")) {
                System.out.println(s.peek());
            }

        }
    }
}