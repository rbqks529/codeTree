import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j<i){
                    System.out.print("  ");
                } else {
                    System.out.print(count++ + " ");

                    if(count == 10){
                        count = 1;
                    }
                }
            }
            System.out.println();
        }
    }
}