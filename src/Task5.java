import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String run;

        do {
            double[] n = new double[3];
            int i = 0;

            // user input and validation
            while (i < 3) {
                System.out.print("Enter number " + (i + 1) + ": ");
                try {
                    n[i++] = sc.nextDouble();
                } catch (Exception e) {
                    System.out.println("Invalid input! Try again.");
                    sc.next();
                }
            }

            if (n[0] == n[1] && n[1] == n[2]) {
                System.out.println("All numbers are equal");
            } else {
                System.out.println("Largest number: " + Math.max(n[0], Math.max(n[1], n[2])));
            }

            System.out.print("Run again? (y/n): ");
            run = sc.next();
        } while (run.equalsIgnoreCase("y"));

        sc.close();

        // lambda version (needs: import java.util.Arrays; import java.util.function.Predicate; import java.util.function.ToDoubleFunction;)
//        Predicate<double[]> allEqual = n -> Arrays.stream(n).distinct().count() == 1;
//        ToDoubleFunction<double[]> largest = n -> Arrays.stream(n).max().getAsDouble();
//
//        Scanner sc = new Scanner(System.in);
//        String run;
//
//        do {
//            double[] n = new double[3];
//            int i = 0;
//
//            // user input and validation
//            while (i < 3) {
//                System.out.print("Enter number " + (i + 1) + ": ");
//                try {
//                    n[i++] = sc.nextDouble();
//                } catch (Exception e) {
//                    System.out.println("Invalid input! Try again.");
//                    sc.next();
//                }
//            }
//
//            if (allEqual.test(n)) {
//                System.out.println("All numbers are equal");
//            } else {
//                System.out.println("Largest number: " + largest.applyAsDouble(n));
//            }
//
//            System.out.print("Run again? (y/n): ");
//            run = sc.next();
//        } while (run.equalsIgnoreCase("y"));
//
//        sc.close();
    }
}
