import java.util.Scanner;

public class OrderAndChaos extends Game {
    private Scanner scanner = new Scanner(System.in);

    public OrderAndChaos() {
        super(6);  // Fixed size 6x6 for Order and Chaos
    }

    @Override
    public boolean checkWin(Player player) {
        // Custom logic for checking win conditions in Order and Chaos
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
        System.out.println("[+] Enter the number of players for Order and Chaos: ");
        int numberOfPlayers = scanner.nextInt();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("[+] Player " + (i + 1) + " please enter your name: ");
            String playerName = scanner.nextLine();

            System.out.print("[+] Player " + (i + 1) + " please enter your symbol (X or O): ");
            char playerSymbol = scanner.nextLine().charAt(0);

            addPlayer(new Player(playerName, playerSymbol, "Order and Chaos"));
        }
    }
}
