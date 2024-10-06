import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class SuperTicTacToe extends Game {
    private Board[][] superBoard;  // 3x3 array of smaller tic-tac-toe boards
    private char[][] superBoardWinners;  // 3x3 array to track who won each sub-board
    private int currentSuperCellRow;
    private int currentSuperCellCol;
    //private boolean restrictToSuperCell;

    public SuperTicTacToe() {
        super(9);  // Overall 9x9 grid size (3x3 of 3x3 boards)
        this.superBoard = new Board[3][3];
        this.superBoardWinners = new char[3][3];  // Initialize to track sub-board winners

        // Initialize each sub-board as a 3x3 Tic Tac Toe board and set superBoardWinners to empty values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                superBoard[i][j] = new Board(3);  // Create a 3x3 board for each sub-board
                superBoardWinners[i][j] = ' ';    // Mark as not won initially
            }
        }
    }

    public static SuperTicTacToe configureGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("[+] Welcome to Super Tic Tac Toe!");
        System.out.println("The game is played on a 3x3 grid of Tic Tac Toe boards.");
        System.out.println();

        return new SuperTicTacToe();
    }

    @Override
    public void initializePlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initializing players for Super Tic Tac Toe...");

        Set<Character> chosenSymbols = new HashSet<>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter the name for Player " + i + ": ");
            String name = scanner.nextLine();

            char symbol;
            while (true) {
                System.out.print("Player " + i + ", choose your symbol (single character): ");
                String input = scanner.nextLine().trim().toUpperCase();

                // Validate input: must be a single character and not already chosen
                if (input.length() == 1) {
                    symbol = input.charAt(0);
                    if (!chosenSymbols.contains(symbol)) {
                        chosenSymbols.add(symbol);  // Add symbol to the set of chosen symbols
                        break;
                    } else {
                        System.out.println("This symbol is already taken. Please choose a different one.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a single character.");
                }
            }

            addPlayer(new Player(name, symbol, "Super Tic Tac Toe"));
            System.out.println("[+] Player " + i + ": " + name + " will play as '" + symbol + "'");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public boolean checkWin(Player player) {
        char playerSymbol = player.getSymbol();
        return checkSuperBoardWin(playerSymbol);
    }

    /**
     * Check if the player has won three sub-boards in a row, column, or diagonal.
     * @param symbol The player's symbol to check.
     * @return true if the player has won the super board, false otherwise.
     */
    private boolean checkSuperBoardWin(char symbol) {
        return checkRowsForSuperBoardWin(symbol) || checkColsForSuperBoardWin(symbol) || checkDiagonalsForSuperBoardWin(symbol);
    }

    private boolean checkRowsForSuperBoardWin(char symbol) {
        for (int row = 0; row < 3; row++) {
            if (superBoardWinners[row][0] == symbol &&
                superBoardWinners[row][1] == symbol &&
                superBoardWinners[row][2] == symbol) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColsForSuperBoardWin(char symbol) {
        for (int col = 0; col < 3; col++) {
            if (superBoardWinners[0][col] == symbol &&
                superBoardWinners[1][col] == symbol &&
                superBoardWinners[2][col] == symbol) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForSuperBoardWin(char symbol) {
        return (superBoardWinners[0][0] == symbol && superBoardWinners[1][1] == symbol && superBoardWinners[2][2] == symbol) ||
               (superBoardWinners[0][2] == symbol && superBoardWinners[1][1] == symbol && superBoardWinners[2][0] == symbol);
    }

    @Override
    public void playTurn(int cellNumber, Player player) {
        Scanner scanner = new Scanner(System.in);
        int[] parsedMove;
    
        // Print the board before asking for a move
        printBoard();
        System.out.println();
    
        while (true) {
            System.out.print("[+] " + player.getName() + "'s turn! Please enter the super cell and cell number (e.g., A1): ");
            String move = scanner.nextLine();
            parsedMove = parseMove(move);
    
            if (parsedMove != null) {
                // Extract parsed move information
                int superCellRow = parsedMove[0];
                int superCellCol = parsedMove[1];
                int cellNumberInSubBoard = parsedMove[2];
    
                int row = (cellNumberInSubBoard - 1) / 3;
                int col = (cellNumberInSubBoard - 1) % 3;
    
                int overallRow = superCellRow * 3 + row;
                int overallCol = superCellCol * 3 + col;
    
                // Check if the move is valid
                if (getBoard().isValidMove(overallRow * getBoard().getSize() + overallCol + 1)) {
                    // Update the board and sub-board
                    getBoard().updateCell(overallRow * getBoard().getSize() + overallCol + 1, player.getSymbol());
                    getSubBoard(superCellRow, superCellCol).updateCell(cellNumberInSubBoard, player.getSymbol());
    
                    // Check for sub-board win condition
                    if (checkSubBoardWin(getSubBoard(superCellRow, superCellCol), player.getSymbol())) {
                        superBoardWinners[superCellRow][superCellCol] = player.getSymbol();  // Mark sub-board as won
                        printBoard();
                        System.out.println();
                        System.out.println("[+] Sub-board " + (char) ('A' + superCellRow * 3 + superCellCol) + " has been won by " + player.getName() + "!");
                        displaySubBoardWins();  // Display the current state of sub-board wins

                        // Check if the player has won the super board
                        if (checkSuperBoardWin(player.getSymbol())) {
                            return;
                            /** 
                            System.out.println();
                            System.out.println("[+] " + player.getName() + " wins Super Tic Tac Toe!");
                            displaySubBoardWins();
                            return;
                            */
                        }
                    }
                    else if (getSubBoard(superCellRow, superCellCol).isBoardFull()) {
                        superBoardWinners[superCellRow][superCellCol] = '~';  // Mark sub-board as draw
                        System.out.println("[+] Sub-board " + (char) ('A' + superCellRow * 3 + superCellCol) + " is a draw!");
                    }
    
                    // Set the restriction for the next move and break out of the loop
                    setCurrentSuperCell(row, col);
                    //setRestrictToSuperCell(true);
                    break;
                } else {
                    // Invalid move handling
                    System.out.println("[!] Cell occupied or invalid! Try another move.");
                }
            }
        }
    
        switchTurn();  // Switch turn to the next player
    }

    /**
    * Parses and validates the player's move input.
    * @param input The raw move input entered by the player (e.g., "A1" or "C3").
    * @return An array of {superCellRow, superCellCol, cellNumber} if valid, or null if invalid.
    */
    public int[] parseMove(String input) {
        input = input.toUpperCase().trim();  // Normalize the input
    
        // Validate input length and characters
        if (input.length() != 2) {
            System.out.println("[!] Invalid input. Please enter in the format of SuperCell [(A-I) and Cell number (1-9), like A1 or B3]");
            return null;
        }

        char superCell = input.charAt(0);
        char cellChar = input.charAt(1);
        int cellNumber = Character.getNumericValue(cellChar);
        if (superCell < 'A' || superCell > 'I' || !Character.isDigit(cellChar) || (cellNumber < 1 || cellNumber > 9)) {
            System.out.println("[!] Invalid input. The first character should be A-I and the second character should be 1-9.");
            return null;
    }

    // Parse the move into row and column indices
    int superCellRow = (superCell - 'A') / 3;  // Calculate row of sub-board (0, 1, or 2)
    int superCellCol = (superCell - 'A') % 3;  // Calculate column of sub-board (0, 1, or 2)

    return new int[]{superCellRow, superCellCol, cellNumber};
}

@Override
public void printBoard() {
    System.out.println();
    // Array to hold sub-board labels (A to I)
    char[][] boardLabels = {
        {'A', 'B', 'C'},
        {'D', 'E', 'F'},
        {'G', 'H', 'I'}
    };

    // Iterate through the 3x3 grid of sub-boards
    for (int i = 0; i < 3; i++) {  // i represents the row of sub-boards
        for (int row = 0; row < 3; row++) {  // row represents rows within each sub-board
            for (int j = 0; j < 3; j++) {  // j represents the column of sub-boards
                // For each cell in a sub-board row, print the cell number with the corresponding board label
                for (int col = 0; col < 3; col++) {
                    int cellNumber = row * 3 + col + 1;  // Calculate the cell number in 1-9 format
                    String cellLabel = boardLabels[i][j] + String.valueOf(cellNumber);  // e.g., A1, A2, A3, etc.

                    // Get cell value or cell label if the cell is empty
                    String cellValue = superBoard[i][j].getCell(row, col).isEmpty() 
                                        ? cellLabel  // Print cell label if empty
                                        : superBoard[i][j].getCell(row, col).getValue() + " ";  // Add space after symbol

                    // Print the cell value with an additional space for formatting
                    System.out.print(cellValue);

                    if (col < 2) System.out.print("|");  // Separator between cells in the same sub-board
                }

                // Print separator between sub-boards and add extra space for formatting
                if (j < 2) System.out.print(" |  ");  // Extra space added for separation between sub-boards
            }
            System.out.println();  // Move to the next row
        }
        if (i < 2) System.out.println("----------+------------+----------");  // Separator between sub-board rows
    }

    // Display which sub-boards have been won by whom
    System.out.println();
    System.out.println("Sub-Board Wins:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            char winner = superBoardWinners[i][j];
            System.out.print(winner == ' ' ? "_" : winner == ' ' ? " " : winner); // Display '_' if not won, or the winner's symbol or ' ' for draw
            if (j < 2) System.out.print(" | ");
        }
        System.out.println();
    }
}

    /**
     * Checks if the given sub-board has been won by the player with the given symbol.
     * @param subBoard The sub-board to check.
     * @param symbol The player's symbol.
     * @return true if the player has won the sub-board, false otherwise.
     */
    private boolean checkSubBoardWin(Board subBoard, char symbol) {
        // Check rows, columns, and diagonals within the sub-board
        return checkRowsForWin(subBoard, symbol) || checkColsForWin(subBoard, symbol) || checkDiagonalsForWin(subBoard, symbol);
    }
    /**
     * Checks rows for win within a sub-board.
     */
    private boolean checkRowsForWin(Board subBoard, char symbol) {
        for (int row = 0; row < 3; row++) {
            if (subBoard.getCell(row, 0).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(row, 1).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(row, 2).getValue().equals(String.valueOf(symbol))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks columns for win within a sub-board.
     */
    private boolean checkColsForWin(Board subBoard, char symbol) {
        for (int col = 0; col < 3; col++) {
            if (subBoard.getCell(0, col).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(1, col).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(2, col).getValue().equals(String.valueOf(symbol))) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks diagonals for win within a sub-board.
     */
    private boolean checkDiagonalsForWin(Board subBoard, char symbol) {
        return (subBoard.getCell(0, 0).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(1, 1).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(2, 2).getValue().equals(String.valueOf(symbol))) ||
               (subBoard.getCell(0, 2).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(1, 1).getValue().equals(String.valueOf(symbol)) &&
                subBoard.getCell(2, 0).getValue().equals(String.valueOf(symbol)));
    }

    /**
     * Method to access a specific sub-board based on row and column indices.
     * @param row The row index of the sub-board (0, 1, 2).
     * @param col The column index of the sub-board (0, 1, 2).
     * @return The sub-board at the specified row and column.
     */
    public Board getSubBoard(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            return superBoard[row][col];
        }
        throw new IllegalArgumentException("Invalid sub-board indices: (" + row + ", " + col + ")");
    }

    /**
     * Sets whether the next move should be restricted to a specific sub-board.
     * @param restrict true to restrict moves to a specific sub-board, false to allow any move.
     
    public void setRestrictToSuperCell(boolean restrict) {
        this.restrictToSuperCell = restrict;
    }
    */      
    /**
     * Sets the current super cell row and column based on the given values.
     * This is used to restrict the next move to a specific sub-board.
     * @param row The row index of the sub-board.
     * @param col The column index of the sub-board.
     */
    public void setCurrentSuperCell(int row, int col) {
        this.currentSuperCellRow = row;
        this.currentSuperCellCol = col;
    }
    
    /**
    * Displays the current state of sub-board wins.
    * Shows which sub-boards have been won by which player.
    */
    private void displaySubBoardWins() {
        System.out.println("Sub-Board Wins:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char winner = superBoardWinners[i][j];
                System.out.print(winner == ' ' ? "_" : winner);  // Display '_' if not won, or the winner's symbol
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
