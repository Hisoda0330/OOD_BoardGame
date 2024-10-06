import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    protected Board board;
    protected List<Player> players;
    protected int currentTurn;
    private int size;
    
    public Game(int boardSize) {
        size = boardSize;
        this.board = new Board(boardSize);
        players = new ArrayList<>();
        currentTurn = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void switchTurn() {
        currentTurn = (currentTurn + 1) % players.size();
    }

    public Player getCurrentPlayer() {
        return players.get(currentTurn);
    }

    public Board getBoard() {  
        return board;
    }
    public int getBoardSize() {
        return size;
    }

    // Abstract method to check if a player has won (must be implemented by subclasses)
    public abstract boolean checkWin(Player player);
    
    // Abstract method to handle a player's turn (must be implemented by subclasses)
    public abstract void playTurn(int cellNumber, Player player);

    // Abstract method to initialize players (must be implemented by subclasses)
    public abstract void initializePlayers(); 

    // Abstract method that must be implemented in TicTacToe and other games
    //public abstract boolean checkWin(Player player);
}
