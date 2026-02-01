import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i=0; i<N; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<4; j++){
                sum += Integer.parseInt(st.nextToken());
            }

            if(sum / 4 >= 60){
                count++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(count);
    }
}