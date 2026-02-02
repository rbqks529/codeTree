import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        printSquare(N);
    }

    public static void printSquare(int N) {
        int count = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                count++;
                if(count == 10){
                    count = 1;
                }

                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}