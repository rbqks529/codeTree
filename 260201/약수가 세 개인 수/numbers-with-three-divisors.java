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
            if(getDivisors(i)){
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean getDivisors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if(count == 3){
            return true;
        } else {
            return false;
        }
    }
}