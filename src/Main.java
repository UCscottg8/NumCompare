import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Output statement
        System.out.println("Enter the first number: ");
        while (!scanner.hasNextDouble()) {
            // Output statement
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        while (!scanner.hasNextDouble()) {
            // Output statement
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            // Output statement
            System.out.println("The numbers are equal.");
        } else if (num1 < num2) {
            // Output statement
            System.out.println("The first number is less than the second number.");
        } else {
            // Output statement
            System.out.println("The second number is less than the first number.");
        }
    }
}