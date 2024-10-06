import java.util.Scanner;

public class GameManager {
    private Scanner scanner = new Scanner(System.in);

    public void startGame(String gameType) {
        if (gameType.equals("TicTacToe")) {
            playTicTacToe();
        } else if (gameType.equals("OrderAndChaos")) {
            playOrderAndChaos();
        } else if (gameType.equals("SuperTicTacToe")) {
            // Create and configure a SuperTicTacToe game object
            SuperTicTacToe game = SuperTicTacToe.configureGame();
            // Pass the game object to the playSuperTicTacToe method
            playSuperTicTacToe(game);
        } else {
            throw new IllegalArgumentException("Unknown game type: " + gameType);
        }

        // After the game ends, offer the player the option to quit or play again
        if (askToQuit()) {
            System.exit(0);  // If the player chooses to quit, exit the loop and program
        }
    }

    // Method to handle the TicTacToe game specifically
    public void playTicTacToe() {
        Game game = TicTacToe.configureGame();  // Configure and initialize TicTacToe
        game.initializePlayers();

        while (true) {
            Player currentPlayer = game.getCurrentPlayer();
            game.printBoard();

            int boardSize = game.getBoardSize();
            System.out.println("[+] " + currentPlayer.getName() + "'s turn! Please enter a cell number: ");
            int cellNumber = InputUtil.getValidCellNumber(boardSize);

            game.playTurn(cellNumber, currentPlayer);

            if (game.checkWin(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (game instanceof TicTacToe && ((TicTacToe) game).isBoardFull()) {
                System.out.println("The game is a draw! The board is full.");
                break;  // End the game as a draw
            }

            game.switchTurn();  // Switch to the next player's turn
        }
    }

    // Method to handle the OrderAndChaos game specifically
    public void playOrderAndChaos() {
        Game game = new OrderAndChaos();  // Create a new OrderAndChaos game
        game.initializePlayers();

        while (true) {
            Player currentPlayer = game.getCurrentPlayer();
            game.printBoard();

            int boardSize = game.getBoardSize();
            System.out.println("[+] " + currentPlayer.getName() + "'s" + " (" + game.getCurrentPlayer().getSymbol() + ") " + "turn! Please enter a cell number: ");
            int cellNumber = InputUtil.getValidCellNumber(boardSize);

            game.playTurn(cellNumber, currentPlayer);

            if (game.checkWin(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            game.switchTurn();  // Switch to the next player's turn
        }
    }

    // Method to handle the SuperTicTacToe game specifically
    public void playSuperTicTacToe(SuperTicTacToe game) {
        game.initializePlayers();
    
        while (true) {    
            game.playTurn(-1, game.getCurrentPlayer());  // Pass the current player to playTurn
        
            // If a win condition is met, the game will end inside `playTurn`, so no need to check here
            if (game.checkWin(game.getCurrentPlayer())) {
                System.out.println();
                System.out.println("[+] " + game.getCurrentPlayer().getName() + " (" + game.getCurrentPlayer().getSymbol() + ")" + " wins Super Tic Tac Toe!");
                break;
            }
        }
    }
    


    // Display the main menu for the player to choose a game
    public void mainMenu() {
        while (true) {
            int gamesize = 3;  // Updated to 3 games: Tic Tac Toe, Order and Chaos, Super Tic Tac Toe
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("Choose a game to play:");
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Order and Chaos");
            System.out.println("3. Super Tic Tac Toe");  // New option for Super Tic Tac Toe
            System.out.print("Enter number of the game to play: ");
            int choice = InputUtil.scanValidInteger();

            while (choice < 1 || choice > gamesize) {
                System.out.print("[!] Invalid, Please input the correct number for the game: ");
                choice = InputUtil.scanValidInteger();
            }

            // Start the selected game based on the user's choice
            if (choice == 1) {
                startGame("TicTacToe");
            } else if (choice == 2) {
                startGame("OrderAndChaos");
            } else if (choice == 3) {
                startGame("SuperTicTacToe");  // Start Super Tic Tac Toe game
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    // Ask the player if they want to quit or continue playing
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
