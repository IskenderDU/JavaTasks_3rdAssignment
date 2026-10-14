import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int zero = 0;

        for (int i = 1; i<=N; i++) {
            int x = in.nextInt();
            if (x == 0) {
                zero++;
            }
        }
        System.out.println(zero);
    }
}