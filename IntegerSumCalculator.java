import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers:");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Sum of the integers: " + sum);

        scanner.close();
    }
}
