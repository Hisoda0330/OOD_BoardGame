import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe extends Game {
    private int symbolsInRowToWin;
    private Scanner scanner = new Scanner(System.in);  // Scanner to take input

    public TicTacToe(int boardSize, int symbolsInRowToWin) {
        super(boardSize);
        this.symbolsInRowToWin = symbolsInRowToWin;
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

    @Override
    public boolean checkWin(Player player) {
        // Check all rows, columns, and diagonals for the winning condition based on the current player's symbol
        return checkRowsForWin(player) || checkColsForWin(player) || checkDiagonalsForWin(player);
    }

    // Check each row for the winning condition
    private boolean checkRowsForWin(Player player) {
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col <= board.getSize() - symbolsInRowToWin; col++) {
                if (isConsecutive(row, col, 0, 1, player)) {  // Check across the row
                    return true;
                }
            }
        }
        return false;
    }

    // Check each column for the winning condition
    private boolean checkColsForWin(Player player) {
        for (int col = 0; col < board.getSize(); col++) {
            for (int row = 0; row <= board.getSize() - symbolsInRowToWin; row++) {
                if (isConsecutive(row, col, 1, 0, player)) {  // Check down the column
                    return true;
                }
            }
        }
        return false;
    }

    // Check both diagonals (left-to-right and right-to-left) for the winning condition
    private boolean checkDiagonalsForWin(Player player) {
        // Check left-to-right diagonal (top-left to bottom-right)
        for (int row = 0; row <= board.getSize() - symbolsInRowToWin; row++) {
            for (int col = 0; col <= board.getSize() - symbolsInRowToWin; col++) {
                if (isConsecutive(row, col, 1, 1, player)) {  // Check top-left to bottom-right diagonal
                    return true;
                }
            }
        }

        // Check right-to-left diagonal (top-right to bottom-left)
        for (int row = 0; row <= board.getSize() - symbolsInRowToWin; row++) {
            for (int col = symbolsInRowToWin - 1; col < board.getSize(); col++) {
                if (isConsecutive(row, col, 1, -1, player)) {  // Check top-right to bottom-left diagonal
                    return true;
                }
            }
        }

        return false;
    }

// Helper method to check if there are 'symbolsInRowToWin' consecutive symbols in a line
private boolean isConsecutive(int row, int col, int rowStep, int colStep, Player player) {
    // Get the current player's symbol
    char playerSymbol = player.getSymbol();

    // Get the symbol in the first cell
    String firstSymbol = board.getCell(row, col).getValue();

    // Ensure the first cell contains the player's symbol (not just any symbol)
    if (firstSymbol.equals(String.valueOf(playerSymbol))) {
        // Check the next 'symbolsInRowToWin - 1' cells in the specified direction
        for (int i = 1; i < symbolsInRowToWin; i++) {
            int newRow = row + i * rowStep;
            int newCol = col + i * colStep;
            String nextSymbol = board.getCell(newRow, newCol).getValue();

            // If the symbols don't match the player's symbol, return false
            if (!firstSymbol.equals(nextSymbol)) {
                return false;
            }
        }
        // If all symbols match, return true
        return true;
    }
    // If the first cell doesn't contain the player's symbol, return false
    return false;
}

    @Override
    public void playTurn(int cellNumber, Player player) {
        if (board.isValidMove(cellNumber)) {
            board.updateCell(cellNumber, player.getSymbol());
        } else {
            throw new IllegalArgumentException("Invalid move! Try again.");
        }
    }

    @Override
    public void initializePlayers() {
        System.out.print("[+] Enter the number of teams: ");
        int numberOfTeams = scanValidInteger();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numberOfTeams; i++) {
            System.out.print("[+] Team " + (i + 1) + ", please enter your team name: ");
            String teamName = scanner.nextLine();
            
            System.out.print("[+] Enter the number of players for team " + teamName + ": ");
            int numberOfPlayers = scanValidInteger();
            scanner.nextLine();  // Consume newline
            
            for (int j = 0; j < numberOfPlayers; j++) {
                System.out.print("[+] Team " + teamName + ", Player " + (j + 1) + " please enter your name: ");
                String playerName = scanner.nextLine();

                System.out.print("[+] Team " + teamName + ", Player " + (j + 1) + " please enter your symbol: ");
                char playerSymbol = scanner.nextLine().charAt(0);
                
                addPlayer(new Player(playerName, playerSymbol, teamName));
            }
        }
    }


}
