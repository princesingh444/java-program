import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        // Step 2: Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Step 3: Prompt the user to enter the first number
        System.out.print("Enter the first number: ");

        // Step 4: Read the first number and store it in a variable
        double number1 = input.nextDouble();

        // Step 5: Prompt and read the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Step 6: Calculate the sum
        double sum = number1 + number2;

        // Step 7: Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Step 8: Close the Scanner object
        input.close();
    }
}
