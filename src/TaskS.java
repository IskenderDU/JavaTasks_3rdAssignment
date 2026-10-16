import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sec = in.nextInt();
        int printedCount = 0;
        int currentNumber = 1;

        while (printedCount < sec) {
            for (int j = 1; j <= currentNumber; j++) {
                if (printedCount == sec) {
                    break;
                }
                    System.out.print(currentNumber + " ");
                printedCount++;
            }
            currentNumber++;
        }
    }
}
