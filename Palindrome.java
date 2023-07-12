import java.util.Scanner;
public class ${NAME} {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the input string from the user.
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        // Check if the string is a palindrome using the built-in function.
        boolean is${NAME} = str.equals(new StringBuilder(str).reverse().toString());
        // Print the result.
        if (is${NAME}) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
