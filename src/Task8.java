import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {

    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;
        for (int num : numbers) {
            int paramSum = 0;
            for (int i = 1; i <= num; i++) {
                paramSum += i;
            }

            System.out.println("Cumulative sum for parameter " + num + " = " + paramSum);

            totalSum += paramSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("\n=== Cumulative Sum Calculator ===");

            int count = getValidPositiveInt(sc, "How many parameters do you want to enter? ");
            int[] inputs = new int[count];

            for (int i = 0; i < count; i++) {
                inputs[i] = getValidPositiveInt(sc, "Enter integer #" + (i + 1) + ": ");
            }

            System.out.println("\n--- Results ---");
            int total = cumulativeSum(inputs);

            System.out.println("---------------------------------");
            System.out.println("Total sum of all parameters = " + total);

            System.out.print("\nDo you want to run another calculation? (Y/N): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("Y")) {
                repeat = false;
                System.out.println("Program terminated. Goodbye!");
            }
        }

        sc.close();
    }

    private static int getValidPositiveInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = sc.nextInt();
                if (value <= 0) {
                    System.out.println("Invalid input! Please enter a positive integer greater than 0.");
                    continue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer (no letters or decimals).");
                sc.next();
            }
        }
    }
}
