public class Cell {
    private String value;

    public Cell(String value) {
        this.value = value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public boolean isEmpty() {
        return isNumber();  // A cell is empty if it still contains its original number
    }
    public boolean isSuperEmpty() {
        return value.equals(" ");  // Empty cell is represented by a single space
    }

    public boolean isOccupied() {
        try {
            // If the value is still a number, it's not occupied
            Integer.parseInt(value);
            return false;
        } catch (NumberFormatException e) {
            // If it's not a number, it's occupied by a symbol (X or O)
            return true;
        }
    }
    
    public boolean isNumber() {
        // Check if the current value is a number (i.e., it hasn't been replaced by a symbol)
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
