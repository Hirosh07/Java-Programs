

import java.util.Scanner;

public class ${NAME} {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.nextLine();

        for (int i = 0; i < word.length();i = i+2){

            System.out.println(word.charAt(i));

        }
    }
}