import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("\n=== Arithmetic Calculator ===");

            double num1 = getValidDouble(sc, "Enter first number: ");
            double num2 = getValidDouble(sc, "Enter second number: ");

            System.out.println("\n--- Results ---");
            System.out.println("Addition (+): " + ((Arithmetic) (a, b) -> a + b).calculate(num1, num2));
            System.out.println("Subtraction (-): " + ((Arithmetic) (a, b) -> a - b).calculate(num1, num2));
            System.out.println("Multiplication (*): " + ((Arithmetic) (a, b) -> a * b).calculate(num1, num2));

            if (num2 == 0) {
                System.out.println("Division (/): Error - Division by zero is undefined.");
            } else {
                System.out.println("Division (/): " + ((Arithmetic) (a, b) -> a / b).calculate(num1, num2));
            }

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("Y")) {
                repeat = false;
                System.out.println("Program terminated. Goodbye!");
            }
        }

        sc.close();
    }

    private static double getValidDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid numerical value.");
                sc.next();
            }
        }
    }
}

interface Arithmetic {
    public double calculate(double num1, double num2);
}
