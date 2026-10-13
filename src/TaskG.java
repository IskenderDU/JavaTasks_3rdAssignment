import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int a = 2;

        for (int i = a; i<=x; i++) {
            if (x % i == 0) {
                System.out.println(i); break;
            }
        }
    }
}