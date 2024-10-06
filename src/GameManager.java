import java.util.Scanner;

public class GameManager{
    private Scanner scanner = new Scanner(System.in);

    public void startGame(String gameType) {
        Game game;
        if (gameType.equals("TicTacToe")) {
            game = TicTacToe.configureGame();
        } else if (gameType.equals("OrderAndChaos")) {
            game = new OrderAndChaos();
        } else {
            throw new IllegalArgumentException("Unknown game type: " + gameType);
        }

        game.initializePlayers();
        playGame(game);

        // After the game ends, offer the player the option to quit or play again
        if (askToQuit()) {
            System.exit(0);  // If the player chooses to quit, exit the loop and program
        }
    }

    public void playGame(Game game) {
        while (true) {
            Player currentPlayer = game.getCurrentPlayer();
            game.getBoard().display();  // Now get the board using getBoard()
            int boardsize = game.getBoardSize();
            System.out.println("[+] " + currentPlayer.getName() + "'s turn! Please enter a cell number: ");
            int cellNumber = InputUtil.getValidCellNumber(boardsize);

            game.playTurn(cellNumber, currentPlayer);

            if (game.checkWin(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }
            // If the game is TicTacToe, check if the board is full for a draw
            if (game instanceof TicTacToe && ((TicTacToe) game).isBoardFull()) {
                System.out.println("The game is a draw! The board is full.");
                break;  // End the game as a draw
            }


            game.switchTurn();
        }
    }

    public void mainMenu() {
        while (true) {
            int gamesize = 2;
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("Choose a game to play:");
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Order and Chaos");
            System.out.print("Enter number of the game to play: ");
            int choice = InputUtil.scanValidInteger();
            while(choice > gamesize){
                System.out.print("[!]Invalid, Please input the correct number for game: ");
                choice = InputUtil.scanValidInteger();
            }
            if (choice == 1) {
                startGame("TicTacToe");
            } else if (choice == 2) {
                startGame("OrderAndChaos");
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
    public boolean askToQuit() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.print("[+] The game is over! Would you like to play again or quit? (Type 'quit' to exit or 'play' to start a new game):");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("quit")) {
            System.out.println("Thanks for playing. Goodbye!");
            System.exit(0);  // Exit the program
            return true;  // Return true to indicate the player chose to quit
        } else if (input.equalsIgnoreCase("play")) {
            return false;  // Return false to indicate the player wants to play again
        } else {
            System.out.println("[!] Invalid input. Please type 'quit' to exit or 'play' to continue.");
            return askToQuit();  // Recursively ask again for a valid input
        }
    }

}
