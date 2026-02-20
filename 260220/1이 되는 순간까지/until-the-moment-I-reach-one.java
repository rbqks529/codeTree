import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fun(n));
    }

    public static int fun(int n){
        int next;
        int count = 1;

        if(n % 2 == 0){
            next = n/2;
        } else {
            next = n/3;
        }

        if(next == 1){
            return count;
        }

        return count + fun(next);
    }
}