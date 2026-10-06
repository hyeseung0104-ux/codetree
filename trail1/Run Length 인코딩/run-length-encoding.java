import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    String a = sc.next();
                            StringBuilder result = new StringBuilder();

                                    char current = a.charAt(0);
                                            int count = 1;

                                                    for (int i = 1; i < a.length(); i++) {
                                                                if (a.charAt(i) == current) {
                                                                                // 이전 문자와 같으면 개수 증가
                                                                                                count++;
                                                                                                            } else {
                                                                                                                            // 다른 문자가 나오면 이전 문자와 개수 저장
                                                                                                                                            result.append(current).append(count);

                                                                                                                                                            // 새로운 문자부터 다시 세기
                                                                                                                                                                            current = a.charAt(i);
                                                                                                                                                                                            count = 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                                }

                                                                                                                                                                                                                        // 마지막 문자 묶음은 반복문이 끝난 뒤 저장
                                                                                                                                                                                                                                result.append(current).append(count);

                                                                                                                                                                                                                                        System.out.println(result.length());
                                                                                                                                                                                                                                                System.out.println(result);

                                                                                                                                                                                                                                                        sc.close();
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            