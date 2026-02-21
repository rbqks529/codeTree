import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] tempArr = new int[n];
        tempArr = arr.clone();
        Arrays.sort(tempArr);

        for(int i=0; i<n; i++){
            int num = arr[i];
            for(int j=0; j<n; j++){
                if(num == tempArr[j]){
                    System.out.print(j+1 + " ");
                    tempArr[j] = -1;
                    break;
                }
            }
        }
    }
}