import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i<=100; i++) {
            int x = in.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}