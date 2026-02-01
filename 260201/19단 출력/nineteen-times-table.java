public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int a = 1;
        int b = 1;

        while(true){
            if(b == 19){
                sb.append(a + " * " + b + " = " + a*b + '\n');

                if(a == 19 && b == 19){
                    break;
                }
                a += 1;
                b = 1;
            } else {
                sb.append(a + " * " + b + " = " + a*b + " / " + a + " * " + (b+1) + " = " + a*(b+1) + '\n');
                b += 2;
            }
        }
         
        System.out.print(sb);
    }
}