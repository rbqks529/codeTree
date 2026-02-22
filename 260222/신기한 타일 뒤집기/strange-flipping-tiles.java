import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arrs = new int[200001];
        int index = 100000;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R') {
                for(int j=0; j<x; j++){
                    arrs[index] = 2;
                    index++;
                }
                index--;
            } else {
                for(int j=0; j<x; j++){
                    arrs[index] = -1;
                    index--;
                }
                index++;
            }
        }

        int black = 0;
        int white = 0;
        for(int i=0; i<200001; i++){
            if(arrs[i] == - 1) white++;
            if(arrs[i] == 2) black++;
        }

        System.out.println(white + " " + black);
    }
}