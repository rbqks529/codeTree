import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        char[] input = t.toCharArray();
        List<String> filtered = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(t)) {
                    filtered.add(words[i]);
            }
        }

        Collections.sort(filtered);

        System.out.println(filtered.get(k-1));
    }
}

