import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int zero = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 1; i<=N; i++) {
            int x = in.nextInt();
            if (x == 0) {
                zero++;
            }
            else if (x > 0) {
                pos++;
            }
            else {
                neg++;
            }
        }
        System.out.println(zero + " " + pos + " " + neg + " ");
    }
}