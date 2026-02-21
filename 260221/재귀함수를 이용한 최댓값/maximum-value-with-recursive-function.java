import java.util.Scanner;
import java.math.*;
public class Main {
    static int[] arr;
    static int n;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        max(0);
        System.out.println(max);
    }

    static void max(int index){
        if(index >= n){
            return;
        }

        max = Math.max(arr[index], max);

        max(index + 1);
    }
}