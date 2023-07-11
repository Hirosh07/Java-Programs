import java.util.Scanner;
public class ${NAME} {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two numbers
        System.out.print("Enter first numbers:");
        int number1 = input.nextInt();
        System.out.print("Enter Second numbers");
        int number2 = input.nextInt();
        // Compare the two numbers and print the greater value
        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
