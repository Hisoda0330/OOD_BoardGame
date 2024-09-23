# CS611-Assignment < 1 >
## < Object-Oriented Board Game >
---------------------------------------------------------------------------
- Name: Jinpeng Huang
- Email: Jinpeng@bu.edu
- Student ID: U19568777

## Files

**Main.java:** This class is responsible for start up the menu for games.

**Board.java**: This class is responsible for the creation of the board and check if there are spaces for symbols, such as the size, and display the updated board after player place their symbols

**Cell.java:** This class is responsible for checking the value have being replaced by player’s symbol. Such as empty space and holding value.

**Game.java:** This class is responsible for defining common interface and structure that different types of game must follow. It is an abstract class and ensures code can be reused for games that has common behaviors.

**GameManager.java:** This class is responsible for controlling the overall flow of the game. It manages the game setup, handles user input, and interaction of the Game class and subclasses (such as TicTacToe and OrderAndChaos).

**OrderAndChaos.java:** This class is responsible for implementing the specific rule and functionality for this particular game, such as winning conditions, size of the board, numbers of players. 

**TicTacToe.java:** This class is responsible for implementing the specific rule and functionality for this game, such as winning conditions, size of the board, numbers of players. 

**Player.java:** This class is responsible for storing player informations for different types of game after startup.

**InputUtil.java:** This class is responsible for common input validation for user input, such as valid user's input where it requires an integer input. 

## Notes
---------------------------------------------------------------------------
- The program is extendable and object-oriented, can implemented with many board games such as connect four and chess.

- The use of inheritance with the TicTacToe and OrderAndChaos, simpler the code with the common behavior of the game.
  
- Player can customize the winning condition(# of connections to win) and the board size in the Tic-Tac-Toe game.

- It contians an individual file that put restrictions on player inputting the wrong input such as inputting a string when it requires integer, the program would not crash but prompt them to re-input with a character symbol.

- It was designed to be easily played, instead of asking a tuple to place their symbol, all the grid was marked by numbers, player can place their symbol simply inputting the number in the board. 

- It smoothly alternates between players, no matter how many team or player does it have in the game.

- It ask the players if they want to continue or quit the game after one round have been played.


## How to compile and run
---------------------------------------------------------------------------
1. Unzip the file
2. Go to terminal, make sure location is in the folder of the game. 
3. Type javac *.java in terminal.
4. Type java Main in terminal. 

## Input/Output Example
---------------------------------------------------------------------------
Please give us a full execution of what we should see on the screen. Label each text with input and output. For example:

jinpeng@Jinpengs-MacBook-Air src % java Main    

Choose a game to play:  

1.Tic Tac Toe    

2.Order and Chaos  

Enter number of the game to play: 1

[+] Welcome to Tic Tac Toe!      

[+] Enter the board size (nxn): 5     

[+] Would you like to change the number of symbols in a row to win?(y/n): y   

[+] Enter the number of symbols in a row to win: 4     

[+] Enter the number of teams: 2    

[+] Team 1, please enter your team name: CS611    

[+] Enter the number of players for team CS611: 1    

[+] Team CS611, Player 1 please enter your name: Jin    

[+] Team CS611, Player 1 please enter your symbol: A    

[+] Team 2, please enter your team name: CS630    

[+] Enter the number of players for team CS630: 1    

[+] Team CS630, Player 1 please enter your name: Peng    

[+] Team CS630, Player 1 please enter your symbol: B    

+---------------+---------------+---------------+---------------+---------------+
|       1       |       2       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       6       |       7       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|      11       |      12       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 1  

+---------------+---------------+---------------+---------------+---------------+
|       A       |       2       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       6       |       7       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|      11       |      12       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Peng's turn! Please enter a cell number: 2  

+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       6       |       7       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|      11       |      12       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 6    

+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       A       |       7       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|      11       |      12       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Peng's turn! Please enter a cell number: 7  

+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|      11       |      12       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 11  

+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|       A       |      12       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Peng's turn! Please enter a cell number: 12  

+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       3       |       4       |       5       |
+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |       8       |       9       |      10       |
+---------------+---------------+---------------+---------------+---------------+
|       A       |       B       |      13       |      14       |      15       |
+---------------+---------------+---------------+---------------+---------------+
|      16       |      17       |      18       |      19       |      20       |
+---------------+---------------+---------------+---------------+---------------+
|      21       |      22       |      23       |      24       |      25       |
+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 16  

Jin wins!  


[+] The game is over! Would you like to play again or quit? (Type 'quit' to exit or 'play' to start a new game):play  


Choose a game to play:    

1.Tic Tac Toe  

2.Order and Chaos  

Enter number of the game to play: 2  

[+] Welcome to Order and Chaos  


Reminder: The board size is 6x6 for Order and Chaos  

Player 1 wins by connecting 5 ('Order') and Player 2 wins by the board is full without 5 or more connections!  


[+] Enter the number of players for Order and Chaos: 1  

[+] Player 1 please enter your name: Jin  

[+] Player 1 please enter your symbol (X or O): X  

+---------------+---------------+---------------+---------------+---------------+---------------+
|       1       |       2       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       7       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      13       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 1  

+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       2       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       7       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      13       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 2  

+---------------+---------------+---------------+---------------
+---------------+---------------+
|       X       |       X       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       7       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      13       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 3  

+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       X       |       X       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       7       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      13       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 4  

+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       X       |       X       |       X       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       7       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      13       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+  

[+] Jin's turn! Please enter a cell number: 5  

Order wins!  

Jin wins!  


[+] The game is over! Would you like to play again or quit? (Type 'quit' to exit or 'play' to start a new game):quit
Thanks for playing. Goodbye!