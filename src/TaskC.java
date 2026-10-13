import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i<=b; i++) {
            double i1 = Math.sqrt(i);
            if (i1 == (int) i1) {
                System.out.print(i + " ");
            }
        }
    }
}