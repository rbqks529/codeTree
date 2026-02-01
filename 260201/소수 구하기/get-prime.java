import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=N; i++){
            if(getDivisors(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean getDivisors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if(count == 2){
            return true;
        } else {
            return false;
        }
    }
}