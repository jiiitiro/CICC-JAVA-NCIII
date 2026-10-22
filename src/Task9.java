import static java.lang.Math.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("\n=== Math Operation with Static Import ===");

            int firstNum = getValidInt(sc, "Enter first number: ");
            int secondNum = getValidInt(sc, "Enter second number: ");

            System.out.println("\n--- Calculation with Math Operation ---");
            try {
                System.out.println("Addition of " + firstNum + " and " + secondNum + " : " + add(firstNum, secondNum));
            } catch (ArithmeticException e) {
                System.out.println("Addition: Error - Result overflows integer range.");
            }

            try {
                System.out.println("Subtraction of " + firstNum + " and " + secondNum + " : " + subtract(firstNum, secondNum));
            } catch (ArithmeticException e) {
                System.out.println("Subtraction: Error - Result overflows integer range.");
            }

            try {
                System.out.println("Multiplication of " + firstNum + " and " + secondNum + " : " + multiply(firstNum, secondNum));
            } catch (ArithmeticException e) {
                System.out.println("Multiplication: Error - Result overflows integer range.");
            }

            if (secondNum == 0) {
                System.out.println("Division: Error - Division by zero is undefined.");
            } else {
                System.out.println("Division of " + firstNum + " and " + secondNum + " : " + divide(firstNum, secondNum));
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

    private static int getValidInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer (no letters or decimals).");
                sc.next();
            }
        }
    }
}
