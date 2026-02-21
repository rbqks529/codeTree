import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentMonth = sc.nextInt();
        int currentDay = sc.nextInt();
        int targetMonth = sc.nextInt();
        int targetDay = sc.nextInt();
        int elapsedDays = 0;



        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(currentMonth == targetMonth && currentDay == targetDay)
                break;
        
            elapsedDays++;
            currentDay++;
        
            if(currentDay > num_of_days[currentMonth]) {
                currentMonth++;
                currentDay = 1;
            }
        }
        
        System.out.print(elapsedDays + 1);
    }
}
