public class Board {
    private int size;
    private Cell[][] cells;
    private char winnerSymbol = ' ';
    
    public Board(int size) {
        this.size = size;
        cells = new Cell[size][size];

        // Initialize the board with numbers (1, 2, 3, ...)
        int cellNumber = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(String.valueOf(cellNumber));
                cellNumber++;
            }
        }
    }
    public boolean checkWin(char symbol) {
        // Check rows for win
        for (int row = 0; row < 3; row++) {
            if (cells[row][0].getValue().equals(String.valueOf(symbol)) &&
                cells[row][1].getValue().equals(String.valueOf(symbol)) &&
                cells[row][2].getValue().equals(String.valueOf(symbol))) {
                return true;
            }
        }
    
        // Check columns for win
        for (int col = 0; col < 3; col++) {
            if (cells[0][col].getValue().equals(String.valueOf(symbol)) &&
                cells[1][col].getValue().equals(String.valueOf(symbol)) &&
                cells[2][col].getValue().equals(String.valueOf(symbol))) {
                return true;
            }
        }
    
        // Check diagonals for win
        if (cells[0][0].getValue().equals(String.valueOf(symbol)) &&
            cells[1][1].getValue().equals(String.valueOf(symbol)) &&
            cells[2][2].getValue().equals(String.valueOf(symbol))) {
            return true;
        }
    
        if (cells[0][2].getValue().equals(String.valueOf(symbol)) &&
            cells[1][1].getValue().equals(String.valueOf(symbol)) &&
            cells[2][0].getValue().equals(String.valueOf(symbol))) {
            return true;
        }
    
        return false;
    }
    public void printRow(int row) {
        for (int col = 0; col < size; col++) {
            System.out.print(cells[row][col].getValue());
            if (col < size - 1) {
                System.out.print(" | ");  // Separator between cells
            }
        }
    }
    
    public char getWinnerSymbol() {
        return winnerSymbol;
    }

    // Method to check if all cells in the board are occupied
    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cells[i][j].isEmpty()) {  // If any cell is empty, the board is not full
                    return false;
                }
            }
        }
        return true;  // All cells are occupied
    }

    public int getSize() {
        return size;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public boolean isValidMove(int cellNumber) {
        // Convert cell number to row/col and check if it's not already taken by a symbol
        int row = (cellNumber - 1) / size;
        int col = (cellNumber - 1) % size;
        return cells[row][col].isNumber();  // Ensure the cell still has a number
    }

    public void updateCell(int cellNumber, char symbol) {
        // Convert cell number to row/col and update the cell with the player's symbol
        int row = (cellNumber - 1) / size;
        int col = (cellNumber - 1) % size;
        cells[row][col].setValue(String.valueOf(symbol));
    }


    public void display() {
        String borderLine = "+";
        for (int i = 0; i < size; i++) {
            borderLine += "---------------+";
        }

        for (int i = 0; i < size; i++) {
            System.out.println(borderLine);
            System.out.print("|");
            for (int j = 0; j < size; j++) {
                String cellValue = cells[i][j].getValue();
                System.out.printf(" %7s       |", cellValue);
            }
            System.out.println();
        }
        System.out.println(borderLine);
    }
    
}
