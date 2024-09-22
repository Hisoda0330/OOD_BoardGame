public class Player {
    private String name;
    private char symbol;
    private String teamName;

    public Player(String name, char symbol, String teamName) {
        this.name = name;
        this.symbol = symbol;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getTeamName() {
        return teamName;
    }

}
