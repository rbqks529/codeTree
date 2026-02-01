import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int count = 0;
        
        for(int i=start; i<=end; i++){
            if(isPerfectNumber(i)){
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false;
        
        int sum = 1;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }
        
        return sum == n;
    }
}