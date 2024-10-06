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
        // Method to handle symbol input validation
    public static char getOCValidSymbol() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();  // Clear the buffer to avoid immediate invalid input
        }
        while (true) {
            System.out.print("Enter symbol to place (X/O): ");
            String input = scanner.nextLine().trim().toUpperCase();  // Convert input to uppercase automatically

            if (input.equals("X") || input.equals("O")) {
                return input.charAt(0);  // Return the valid symbol
            } else {
                System.out.println("[!] Invalid input. Please enter 'X' or 'O'.");
            }
        }
    }
    
    public static String getYesOrNoInput() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();  // Clear the buffer to avoid immediate invalid input
        }
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();  // Convert input to lowercase and trim spaces

            if (input.equals("y") || input.equals("n")) {
                return input;  // Return valid input
            } else {
                System.out.print("[!] Invalid input. Please enter 'y' or 'n': ");
            }
        }
    }

    // Method to validate cell number within range
    public static int getValidCellNumber(int boardSize) {
        int cellNumber;
        while (true) {
            System.out.print("Enter a cell number: ");
            cellNumber = scanValidInteger();

            if (cellNumber >= 1 && cellNumber <= boardSize * boardSize) {
                return cellNumber;  // Return valid cell number
            } else {
                System.out.println("[!] Invalid cell number! Please enter a number between 1 and " + (boardSize * boardSize) + ".");
            }
        }
    }

}
