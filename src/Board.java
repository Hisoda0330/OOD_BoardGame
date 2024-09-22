public class Board {
    private int size;
    private Cell[][] cells;

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
