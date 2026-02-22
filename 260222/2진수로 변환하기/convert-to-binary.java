import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        int cnt = 0;

        while (true) {
            if(n < 2) {
                digits.add(n);
                break;
            }
        
            digits.add(n % 2);
            n /= 2;
        }
        
        // print binary number
        for(int i = digits.size()-1; i >= 0; i--)
            System.out.print(digits.get(i));
    }
}
