import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String line = br.readLine();
                            if (line == null) return;
                                    
                                            int n = Integer.parseInt(line.trim());
                                                    int[] prices = new int[n];
                                                            
                                                                    StringTokenizer st = new StringTokenizer(br.readLine());
                                                                            for (int i = 0; i < n; i++) {
                                                                                        prices[i] = Integer.parseInt(st.nextToken());
                                                                                                }
                                                                                                        
                                                                                                                int minPrice = prices[0];
                                                                                                                        int maxProfit = 0;
                                                                                                                                
                                                                                                                                        for (int price : prices) {
                                                                                                                                                    maxProfit = Math.max(maxProfit, price - minPrice);
                                                                                                                                                                minPrice = Math.min(minPrice, price);
                                                                                                                                                                        }
                                                                                                                                                                                
                                                                                                                                                                                        System.out.println(maxProfit);
                                                                                                                                                                                            }
                                                                                                                                                                                            }
                                                                                                                                                                                            