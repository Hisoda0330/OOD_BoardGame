import java.util.Scanner;

public class OrderAndChaos extends Game {
    private Scanner scanner = new Scanner(System.in);

    public OrderAndChaos() {
        super(6);  // Fixed size 6x6 for Order and Chaos
    }

    @Override
    public boolean checkWin(Player player) {
        // Check if the Order player forms a line of five consecutive X's or O's
        if (checkRowsForWin(player) || checkColsForWin(player) || checkDiagonalsForWin(player)) {
            System.out.println("Order wins!");
            return true;
        }

        // If the board is full and no win condition is met, Chaos wins
        if (isBoardFull()) {
            System.out.println("Chaos wins!");
            return true;  // Return true to indicate the game has ended (with Chaos winning)
        }

        return false;  // No one has won yet, so continue the game
    }

    // Check if the board is full
    public boolean isBoardFull() {
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                if (!board.getCell(row, col).isOccupied()) {
                    return false;  // If any cell is not occupied, the board is not full
                }
            }
        }
        return true;  // All cells are occupied, the board is full
    }
    
    // Check each row for a winning condition (five consecutive symbols)
    private boolean checkRowsForWin(Player player) {
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col <= board.getSize() - 5; col++) {
                if (isConsecutive(row, col, 0, 1, player)) {  // Check across the row
                    return true;
                }
            }
        }
        return false;
    }

    // Check each column for a winning condition (five consecutive symbols)
    private boolean checkColsForWin(Player player) {
        for (int col = 0; col < board.getSize(); col++) {
            for (int row = 0; row <= board.getSize() - 5; row++) {
                if (isConsecutive(row, col, 1, 0, player)) {  // Check down the column
                    return true;
                }
            }
        }
        return false;
    }

    // Check both diagonals for a winning condition (five consecutive symbols)
    private boolean checkDiagonalsForWin(Player player) {
        // Check top-left to bottom-right diagonal
        for (int row = 0; row <= board.getSize() - 5; row++) {
            for (int col = 0; col <= board.getSize() - 5; col++) {
                if (isConsecutive(row, col, 1, 1, player)) {  // Check diagonal
                    return true;
                }
            }
        }

        // Check top-right to bottom-left diagonal
        for (int row = 0; row <= board.getSize() - 5; row++) {
            for (int col = 4; col < board.getSize(); col++) {
                if (isConsecutive(row, col, 1, -1, player)) {  // Check diagonal
                    return true;
                }
            }
        }

        return false;
    }

    // Helper method to check if there are five consecutive symbols
    private boolean isConsecutive(int row, int col, int rowStep, int colStep, Player player) {
        char playerSymbol = player.getSymbol();
        String firstSymbol = board.getCell(row, col).getValue();

        // Ensure the first cell contains the player's symbol
        if (firstSymbol.equals(String.valueOf(playerSymbol))) {
            for (int i = 1; i < 5; i++) {
                int newRow = row + i * rowStep;
                int newCol = col + i * colStep;
                String nextSymbol = board.getCell(newRow, newCol).getValue();

                if (!firstSymbol.equals(nextSymbol)) {
                    return false;  // If any symbol doesn't match, return false
                }
            }
            return true;  // All five symbols match
        }

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
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("[+] Welcome to Order and Chaos");
        System.out.println();
        System.out.println("Reminder: The board size is 6x6 for Order and Chaos");
        System.out.println("Player 1 wins by connecting 5 ('Order') and Player 2 wins by the board is full without 5 or more connections!");
        System.out.println();
        System.out.print("[+] Enter the number of players for Order and Chaos: ");
        int numberOfPlayers = InputUtil.scanValidInteger();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("[+] Player " + (i + 1) + " please enter your name: ");
            String playerName = scanner.nextLine();

            System.out.print("[+] Player " + (i + 1) + " please enter your symbol (X or O): ");
            char playerSymbol = scanner.nextLine().charAt(0);

            addPlayer(new Player(playerName, playerSymbol, "Order and Chaos"));
        }
    }
}
