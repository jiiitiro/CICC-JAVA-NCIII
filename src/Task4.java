import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Input a string: ");
                String input = sc.nextLine();

                boolean isPalindrome = input.contentEquals(new StringBuilder(input).reverse());
                System.out.println("The input string is " + (isPalindrome ? "" : "not ") + "palindrome.");

                System.out.print("Run again? y: ");
            } while (sc.nextLine().trim().equalsIgnoreCase("y"));

            System.out.println("End");
        }

    }
}
