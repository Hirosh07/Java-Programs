import java.util.Scanner;
public class ${NAME} {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // Calculate the sum of the two numbers
        int sum = number1 + number2;
        // Check if the sum is even or odd
        if (sum % 2 == 0) {
            System.out.println("The sum of the two numbers is even.");
        } else {
            System.out.println("The sum of the two numbers is odd.");
        }
    }
}

