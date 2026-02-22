import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[2001];
        int index = 1000;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R'){
                for(int j=0; j<x; j++){
                    count[index++]++;
                }
            } else {
                for(int j=0; j<x; j++){
                    count[index--]++;
                }
            }
        }

        int answer = 0;
        for(int i=0; i<2001; i++){
            if(count[i] >= 2){
                answer++;
            }
        }

        System.out.println(answer);
    }
}