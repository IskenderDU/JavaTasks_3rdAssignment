import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        boolean zero = false;

        for (int i = 1; i <= N; i++) {
            int x = in.nextInt();
            if (x == 0) {
                zero = true;
            }
        }
        if (zero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}