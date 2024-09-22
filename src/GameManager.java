import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
    private Scanner scanner = new Scanner(System.in);

    public void startGame(String gameType) {
        Game game;
        if (gameType.equals("TicTacToe")) {
            game = configureTicTacToe();
        } else if (gameType.equals("OrderAndChaos")) {
            game = new OrderAndChaos();
        } else {
            throw new IllegalArgumentException("Unknown game type: " + gameType);
        }

        game.initializePlayers();
        playGame(game);
    }

    public Game configureTicTacToe() {
        System.out.println("[+] Welcome to Tic Tac Toe!");
        System.out.print("[+] Enter the board size (nxn): ");
        int size = scanValidInteger();
        //clear left over newLine
        scanner.nextLine();

        // Ask if the user wants to change the number of symbols to win
        System.out.print("[+] Would you like to change the number of symbols in a row to win? (y/n): ");
        String changeSymbols = scanner.nextLine();
        int symbolsInRowToWin = 3;
        
        if (changeSymbols.equalsIgnoreCase("y")) {
            System.out.print("[+] Enter the number of symbols in a row to win: ");
            symbolsInRowToWin = scanValidInteger();
        }

        return new TicTacToe(size, symbolsInRowToWin);
    }

    public void playGame(Game game) {
        while (true) {
            Player currentPlayer = game.getCurrentPlayer();
            game.getBoard().display();  // Now get the board using getBoard()
            
            System.out.println("[+] " + currentPlayer.getName() + "'s turn! Please enter a cell number: ");
            int cellNumber = scanValidInteger();

            game.playTurn(cellNumber, currentPlayer);

            if (game.checkWin(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            game.switchTurn();
        }
    }

    public void mainMenu() {
        while (true) {
            System.out.println("Choose a game to play:");
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Order and Chaos");
            int choice = scanValidInteger();

            if (choice == 1) {
                startGame("TicTacToe");
            } else if (choice == 2) {
                startGame("OrderAndChaos");
            } else {
                System.out.println("Invalid choice.");
            }
        }
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
    private int scanValidInteger() {
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
}
