import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int total = 0;


        for (int x = 0; x<=1000; x++) {
            if (x != e && (a * x * x * x + b * x * x + c * x + d) == 0) {
                total++;
            }
        }
        System.out.println(total);
    }
}