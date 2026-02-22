import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int dayDiff = A - 11;
        int hourDiff = B - 11;
        int minuteDiff = C - 11;

        if(dayDiff < 0 || (dayDiff == 0 && hourDiff < 0)){
            System.out.println(-1);
            return;
        } 

        if(minuteDiff > 0){
            System.out.println(dayDiff * 24 * 60 + hourDiff * 60 + minuteDiff);
        } else {
            System.out.println(dayDiff * 24 * 60 + hourDiff * 60 + minuteDiff + 60);
        }
    }
}