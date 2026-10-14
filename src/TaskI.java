import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextInt();
        int sum = 0;

        for(long i = 1; i * i <= a; i++){
            if(a % i == 0) {
                if (i * i == a) {
                    sum += 1;
                } else {
                    sum += 2;
                }
            }
        }
        System.out.println(sum);
    }
}