import java.util.Scanner;

public class Day1_Basics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Java Operations");

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
      
        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
    }
}
