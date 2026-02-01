import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        for(int i=N; i>0; i--){
            for(int j=1; j<=i; j++){
                if(j==i) {
                    System.out.print(cnt + " * " + j + " = " + cnt*j);
                } else {
                    System.out.print(cnt + " * " + j + " = " + cnt*j + " / ");
                }
            }
            System.out.println();
            cnt++;
        }
    }
}