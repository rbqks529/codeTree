import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        int korean;
        int english;
        int math;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            name = sc.next();
            korean = sc.nextInt();
            english = sc.nextInt();
            math = sc.nextInt();

            students[i] = new Student(name, korean, english, math);
        }
        
        Arrays.sort(students, (a, b) -> {
            if(a.korean == b.korean) {
                if(a.english == b.english){
                    return b.math - a.math;
                }
                return b.english - a.english;
            }
            return b.korean - a.korean;
        });

         for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].korean + " " + students[i].english + " " + students[i].math);
        }
    }
}

class Student {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int a, int b, int c) {
        this.name = name;
        this.korean = a;
        this.english = b;
        this.math = c;
    }
}