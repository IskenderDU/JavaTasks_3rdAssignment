import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum = 0;

        for (int i = 1; i<=N; i++) {
            int x = in.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}