import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        for(int i=0; i<M; i++){
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            while(N != 1){
                count++;

                if(N % 2 == 0){
                    N = N / 2;
                } else {
                    N = N * 3 + 1;
                }
            }
            System.out.println(count);
        }
    }
}