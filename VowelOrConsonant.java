import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user input
            System.out.print("Enter a single letter: ");
            char ch = sc.next().charAt(0);

        
            ch = Character.toLowerCase(ch);

            if (Character.isLetter(ch)) {
               
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("The character is a VOWEL.");
                } else {
                    System.out.println("The character is a CONSONANT.");
                }
            } else {
                System.out.println("Invalid input! Please enter a letter.");
            }

        } catch (Exception e) {
            System.out.println("Error reading input.");
        } finally {
            sc.close();
        }
    }
} 
