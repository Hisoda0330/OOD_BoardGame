import java.util.Scanner;

public class OrderAndChaos extends Game {
    private Scanner scanner = new Scanner(System.in);
    private String[] roles = new String[2];  // To store roles for both players

    public OrderAndChaos() {
        super(6);  // Fixed size 6x6 for Order and Chaos
    }

    @Override
    public boolean checkWin(Player player) {
        // Check if the Order player forms a line of five consecutive X's or O's
        if (checkRowsForWin() || checkColsForWin() || checkDiagonalsForWin()) {
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
    private boolean checkRowsForWin() {
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col <= board.getSize() - 5; col++) {
                if (isConsecutive(row, col, 0, 1)) {  // Check across the row
                    return true;
                }
            }
        }
        return false;
    }

    // Check each column for a winning condition (five consecutive symbols)
    private boolean checkColsForWin() {
        for (int col = 0; col < board.getSize(); col++) {
            for (int row = 0; row <= board.getSize() - 5; row++) {
                if (isConsecutive(row, col, 1, 0)) {  // Check down the column
                    return true;
                }
            }
        }
        return false;
    }

    // Check both diagonals for a winning condition (five consecutive symbols)
    private boolean checkDiagonalsForWin() {
        // Check top-left to bottom-right diagonal
        for (int row = 0; row <= board.getSize() - 5; row++) {
            for (int col = 0; col <= board.getSize() - 5; col++) {
                if (isConsecutive(row, col, 1, 1)) {  // Check diagonal
                    return true;
                }
            }
        }

        // Check top-right to bottom-left diagonal
        for (int row = 0; row <= board.getSize() - 5; row++) {
            for (int col = 4; col < board.getSize(); col++) {
                if (isConsecutive(row, col, 1, -1)) {  // Check diagonal
                    return true;
                }
            }
        }
        return false;
    }

    // Helper method to check if there are five consecutive symbols
    private boolean isConsecutive(int row, int col, int rowStep, int colStep) {
        String firstSymbol = board.getCell(row, col).getValue();

        // Ensure the first cell is not empty
        if (!firstSymbol.equals("")) {
            for (int i = 1; i < 5; i++) {
                int newRow = row + i * rowStep;
                int newCol = col + i * colStep;
                String nextSymbol = board.getCell(newRow, newCol).getValue();

                if (!firstSymbol.equals(nextSymbol)) {
                    return false;  // If any symbol doesn’t match, return false
                }
            }
            return true;  // All five symbols match
        }

        return false;
    }

    @Override
    public void playTurn(int cellNumber, Player player) {
        // Get validated symbol input from InputUtil
        char symbol = InputUtil.getOCValidSymbol();
        while(true){
            if (board.isValidMove(cellNumber)) {
                board.updateCell(cellNumber, symbol);  // Place the chosen symbol on the board
                break;
            } else {
                System.out.print("Cell Occupied! Try again with another cell: ");
                cellNumber=scanner.nextInt();
            }
        }
    }

    @Override
    public void initializePlayers() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("[+] Welcome to Order and Chaos");
        System.out.println();
        System.out.println("Reminder: The board size is 6x6 for Order and Chaos");
        System.out.println("Player 1 wins by connecting 5 (Order) and Player 2 wins if no 5 or more connections are made (Chaos)!");
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print("[+] Player " + (i + 1) + ", please enter your name: ");
            String playerName = scanner.nextLine();

            // If it's the first player, ask for the role
            if (i == 0) {
                while (true) {
                    System.out.print("[+] Player 1, please choose your role (Order/Chaos): ");
                    roles[i] = scanner.nextLine().trim();

                    if (roles[i].equalsIgnoreCase("Order") || roles[i].equalsIgnoreCase("Chaos")) {
                        roles[i] = roles[i].substring(0, 1).toUpperCase() + roles[i].substring(1).toLowerCase();  // Capitalize the role properly
                        break;  // Valid role chosen
                    } else {
                        System.out.println("[!] Invalid input. Please enter either 'Order' or 'Chaos'.");
                    }
                }
            } else {
                // Automatically assign the opposite role to the second player
                roles[i] = roles[0].equals("Order") ? "Chaos" : "Order";
            }

            // Create the player using the simplified constructor
            Player player = new Player(playerName, roles[i]);

            // Add the player to the game
            addPlayer(player);

            // Output reminder of the player's role
            System.out.println("[+] Player " + (i + 1) + ": " + playerName + " is " + roles[i]);
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }
    @Override
    public void printBoard() {
        board.display();    
    }
}
