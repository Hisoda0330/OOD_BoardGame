public class Cell {
    private String value;

    public Cell(String value) {
        this.value = value;
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

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public boolean isEmpty() {
        return isNumber();  // A cell is empty if it still contains its original number
    }
}
