import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr.add(input);

            if(i % 2 == 0){
                Collections.sort(arr);

                System.out.print(arr.get(arr.size()/2) + " ");
            }
        }
        
        
    }
}