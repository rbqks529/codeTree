import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int index){
        if(index <= 1){
            return index;
        }

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}