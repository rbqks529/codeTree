import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] inputArr = new int[100];
        int[] outputArr = new int[10];

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());

            if(num == 0) {
                break;
            } else {
                if(num > 10){
                    num = num / 10;
                    outputArr[num]++;
                }
            }
        }

        for(int i=0; i<9; i++){
            System.out.println(i+1 + " - " + outputArr[i+1]);
        }
    }
}