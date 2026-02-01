import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int index = 0;

        while(st.hasMoreTokens()) {
            int token =  Integer.parseInt(st.nextToken());
            if(index>0 && token == 0){
                index = index - 1;
                break;
            }
            arr[index] = token;
            index++;
            if(index == 10){
                index--;
            }
        }
        

        for(int i=index; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}