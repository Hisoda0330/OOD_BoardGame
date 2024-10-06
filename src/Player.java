public class Player {
    private String name;
    private char symbol;  // Used only for TicTacToe
    private String teamName;  // Used in TicTacToe
    private String role;      // Used in OrderAndChaos

    // Constructor for team-based games like TicTacToe (includes symbol)
    public Player(String name, char symbol, String teamName) {
        this.name = name;
        this.symbol = symbol;
        this.teamName = teamName;
        this.role = "";        // Default value for non-OrderAndChaos games
    }

    // Overloaded constructor for role-based games like OrderAndChaos (no symbol needed)
    public Player(String name, String role) {
        this.name = name;
        this.symbol = '-';  // Default placeholder, as symbol is not used in OrderAndChaos
        this.role = role;
        this.teamName = "";    // Default value for non-TicTacToe games
    }

    // Getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRole() {
        return role;
    }

}
