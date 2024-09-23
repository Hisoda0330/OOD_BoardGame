import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int scanValidInteger() {
        while (true) {
            try {
                return scanner.nextInt();  // Try to read an integer
            } catch (InputMismatchException e) {
                // Handle incorrect input type and prompt user again
                System.out.print("[!] Invalid input. Please enter a valid integer: ");
                scanner.next();  // Clear the invalid input from the scanner
            }
        }
    }
    // Method to ensure the player chooses a unique symbol
    public static char scanUniqueSymbol(Set<Character> chosenSymbols) {
        char playerSymbol;
        while (true) {
            playerSymbol = scanner.nextLine().charAt(0);

            // Check if the symbol is already taken
            if (chosenSymbols.contains(playerSymbol)) {
                System.out.print("[!] The symbol '" + playerSymbol + "' is already taken. Please choose a different symbol: ");
            } else {
                chosenSymbols.add(playerSymbol);  // Add the chosen symbol to the set
                break;  // Exit the loop if the symbol is unique
            }
        }
        return playerSymbol;
    }
    
    private char scanValidChar(char[] validChars) {
        while (true) {
            String input = scanner.nextLine().trim(); // Trim any spaces around the input
    
            if (input.length() == 1) {  // Ensure the input is exactly one character long
                char symbol = input.charAt(0);  // Get the first character
                // Check if the input is within the valid characters (e.g., 'X' or 'O')
                for (char validChar : validChars) {
                    if (symbol == validChar) {
                        return symbol;  // If valid, return the character
                    }
                }
            }
            // If input is invalid, prompt the user again
            System.out.println("[!] Invalid input. Please enter one of the valid characters: " + new String(validChars));
        }
    }

}
