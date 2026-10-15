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

            Arithmetic calc = new Arithmetic(num1, num2);

            System.out.println("\n--- Results ---");
            System.out.println("Addition (+): " + calc.add());
            System.out.println("Subtraction (-): " + calc.sub());
            System.out.println("Multiplication (*): " + calc.multi());

            if (num2 == 0) {
                System.out.println("Division (/): Error - Division by zero is undefined.");
            } else {
                System.out.println("Division (/): " + calc.div());
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

class Arithmetic {
    double num1;
    double num2;

    public Arithmetic(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return this.num1 + this.num2;
    }

    public double sub() {
        return this.num1 - this.num2; // Fixed logic bug (was addition)
    }

    public double multi() {
        return this.num1 * this.num2;
    }

    public double div() {
        return this.num1 / this.num2;
    }
}
