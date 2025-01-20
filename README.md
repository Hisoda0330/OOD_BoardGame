## < Object-Oriented Board Game:TIC-TIC-TOE & ORDER OF CHAOS >
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

**InputUtil.java:** This class is responsible for input validation for user input, such as valid user's input where it requires an integer input. 

**Piece.java:** This class is responsible for storing the symbol/piece of the game

**SuperTicTacToe.java:** This class is responsible for implementing the specific rule and funtionality for super tic tac toe, where it have a unique way of creating a board, printing a board, game rules, style of the board, and win conditions. 

## Notes
---------------------------------------------------------------------------

**Points earn back from Assignment 1**
- fixed Order and Chaos logic, perfectly functions now.
- adds more input validations, now validates all possible case, game would not crash by any bad input from player.
- adds Piece class as required.

**Super Tic-Tac-Toe**
- The program is extendable and object-oriented, can implemented with many board games such as tictactoe, orderandchaos, connect four, chess, supertitactoe, and etc...

- The use of inheritance with the SuperTicTacToes, simpler the code with the common behavior of the game.

- It contians an individual file called InputUtils.java that contains all the validations on player's input, preventing the program to crash from wrong input.

- It was well-designed visually and easily played, instead of asking for a confusing tuple inputs, all the sub-boards were marked by letters, and followed by numbers in each cell. Player can place their symbol simply inputting the sub-board and cell number.

- It smoothly alternates between players, and verifies all the possible win/draw conditions after each move.

- It ask the players if they want to continue or quit the game after one game have been played. Allow player to take control over the flow of program. 


## How to compile and run
---------------------------------------------------------------------------
1. Unzip the file
2. Go to terminal, make sure location is in the folder of the game. 
3. cd src
4. Type javac *.java in terminal.
5. Type java Main in terminal. 

## Input/Output Example
---------------------------------------------------------------------------

jinpeng@Jinpengs-MacBook-Air src % java Main
----------------------------------------------------------------------------------------------------------------
Choose a game to play:
1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
Enter number of the game to play: 3
----------------------------------------------------------------------------------------------------------------
[+] Welcome to Super Tic Tac Toe!
The game is played on a 3x3 grid of Tic Tac Toe boards.

Initializing players for Super Tic Tac Toe...
Enter the name for Player 1: Jin
Player 1, choose your symbol (single character): U
[+] Player 1: Jin will play as 'U'
Enter the name for Player 2: Peng
Player 2, choose your symbol (single character): v
[+] Player 2: Peng will play as 'V'
----------------------------------------------------------------------------------------------------------------

A1|A2|A3 |  B1|B2|B3 |  C1|C2|C3
A4|A5|A6 |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): a1

U |A2|A3 |  B1|B2|B3 |  C1|C2|C3
A4|A5|A6 |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): a2

U |V |A3 |  B1|B2|B3 |  C1|C2|C3
A4|A5|A6 |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): a3

U |V |U  |  B1|B2|B3 |  C1|C2|C3
A4|A5|A6 |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): a4

U |V |U  |  B1|B2|B3 |  C1|C2|C3
V |A5|A6 |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): a5

U |V |U  |  B1|B2|B3 |  C1|C2|C3
V |U |A6 |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): a6

U |V |U  |  B1|B2|B3 |  C1|C2|C3
V |U |V  |  B4|B5|B6 |  C4|C5|C6
A7|A8|A9 |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
_ | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): a9

U |V |U  |  B1|B2|B3 |  C1|C2|C3
V |U |V  |  B4|B5|B6 |  C4|C5|C6
A7|A8|U  |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Sub-board A has been won by Jin!
Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

U |V |U  |  B1|B2|B3 |  C1|C2|C3
V |U |V  |  B4|B5|B6 |  C4|C5|C6
A7|A8|U  |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): b1

U |V |U  |  V |B2|B3 |  C1|C2|C3
V |U |V  |  B4|B5|B6 |  C4|C5|C6
A7|A8|U  |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): b2

U |V |U  |  V |U |B3 |  C1|C2|C3
V |U |V  |  B4|B5|B6 |  C4|C5|C6
A7|A8|U  |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): b3

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  B4|B5|B6 |  C4|C5|C6
A7|A8|U  |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): b5

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  B4|U |B6 |  C4|C5|C6
A7|A8|U  |  B7|B8|B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): b8

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  B4|U |B6 |  C4|C5|C6
A7|A8|U  |  B7|V |B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): b4

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |B6 |  C4|C5|C6
A7|A8|U  |  B7|V |B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): b6

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  B7|V |B9 |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): b9

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  B7|V |U  |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | _ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): b7
[+] Sub-board B is a draw!

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
D1|D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): d1

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |D2|D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): d2

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|D5|D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): d5

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |D6 |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
_ | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): d6

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|D9 |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
_ | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): d9

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Sub-board D has been won by Jin!
Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
G1|G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): g1

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |G2|G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): g2

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |G3 |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): g3

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
G4|G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): g4

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |G5|G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): g5

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |G6 |  H4|H5|H6 |  I4|I5|I6
G7|G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): g77
[!] Invalid input. Please enter in the format of SuperCell [(A-I) and Cell number (1-9), like A1 or B3]
[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): g7

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |G6 |  H4|H5|H6 |  I4|I5|I6
U |G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): g6

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |G8|G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): g8

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |G9 |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
_ | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): g9

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

[+] Sub-board G has been won by Peng!
Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  E1|E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): e1

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |E2|E3 |  F1|F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): f1

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |E2|E3 |  V |F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): e2

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |E3 |  V |F2|F3
D4|U |V  |  E4|E5|E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): e5

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |E3 |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | _ | _
V | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): e3

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Sub-board E has been won by Jin!
Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  I1|I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): i1

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  V |I2|I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): i2

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  V |U |I3
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): i3

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  V |U |V 
U |V |V  |  H4|H5|H6 |  I4|I5|I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): i5

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  V |U |V 
U |V |V  |  H4|H5|H6 |  I4|U |I6
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Peng's turn! Please enter the super cell and cell number (e.g., A1): i6

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  V |U |V 
U |V |V  |  H4|H5|H6 |  I4|U |V 
U |U |V  |  H7|H8|H9 |  I7|I8|I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | _

[+] Jin's turn! Please enter the super cell and cell number (e.g., A1): i8

U |V |U  |  V |U |V  |  C1|C2|C3
V |U |V  |  U |U |V  |  C4|C5|C6
A7|A8|U  |  V |V |U  |  C7|C8|C9
----------+------------+----------
U |V |D3 |  U |U |U  |  V |F2|F3
D4|U |V  |  E4|V |E6 |  F4|F5|F6
D7|D8|U  |  E7|E8|E9 |  F7|F8|F9
----------+------------+----------
V |U |V  |  H1|H2|H3 |  V |U |V 
U |V |V  |  H4|H5|H6 |  I4|U |V 
U |U |V  |  H7|H8|H9 |  I7|U |I9

Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | U

[+] Sub-board I has been won by Jin!
Sub-Board Wins:
U | ~ | _
U | U | _
V | _ | U

[+] Jin (U) wins Super Tic Tac Toe!

----------------------------------------------------------------------------------------------------------------
[+] The game is over! Would you like to play again or quit? (Type 'quit' to exit or 'play' to start a new game):play

----------------------------------------------------------------------------------------------------------------
Choose a game to play:
1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
Enter number of the game to play: 1

----------------------------------------------------------------------------------------------------------------
[+] Welcome to Tic Tac Toe!

[+] Enter the board size (nxn): 3
[+] Would you like to change the number of connects to win? (y/n): n
[+] Enter the number of teams: 1
[+] Team 1, please enter your team name: Yellow
[+] Enter the number of players for team Yellow: 2
[+] Team Yellow, Player 1 please enter your name: Jin
[+] Team Yellow, Player 1 please enter your symbol: X
[+] Team Yellow, Player 2 please enter your name: Peng
[+] Team Yellow, Player 2 please enter your symbol: O
+---------------+---------------+---------------+
|       1       |       2       |       3       |
+---------------+---------------+---------------+
|       4       |       5       |       6       |
+---------------+---------------+---------------+
|       7       |       8       |       9       |
+---------------+---------------+---------------+
[+] Jin's turn! Please enter a cell number: 
Enter a cell number: 1
+---------------+---------------+---------------+
|       X       |       2       |       3       |
+---------------+---------------+---------------+
|       4       |       5       |       6       |
+---------------+---------------+---------------+
|       7       |       8       |       9       |
+---------------+---------------+---------------+
[+] Peng's turn! Please enter a cell number: 
Enter a cell number: 2
+---------------+---------------+---------------+
|       X       |       O       |       3       |
+---------------+---------------+---------------+
|       4       |       5       |       6       |
+---------------+---------------+---------------+
|       7       |       8       |       9       |
+---------------+---------------+---------------+
[+] Jin's turn! Please enter a cell number: 
Enter a cell number: 3
+---------------+---------------+---------------+
|       X       |       O       |       X       |
+---------------+---------------+---------------+
|       4       |       5       |       6       |
+---------------+---------------+---------------+
|       7       |       8       |       9       |
+---------------+---------------+---------------+
[+] Peng's turn! Please enter a cell number: 
Enter a cell number: 5
+---------------+---------------+---------------+
|       X       |       O       |       X       |
+---------------+---------------+---------------+
|       4       |       O       |       6       |
+---------------+---------------+---------------+
|       7       |       8       |       9       |
+---------------+---------------+---------------+
[+] Jin's turn! Please enter a cell number: 
Enter a cell number: 7
+---------------+---------------+---------------+
|       X       |       O       |       X       |
+---------------+---------------+---------------+
|       4       |       O       |       6       |
+---------------+---------------+---------------+
|       X       |       8       |       9       |
+---------------+---------------+---------------+
[+] Peng's turn! Please enter a cell number: 
Enter a cell number: 8
Peng wins!

----------------------------------------------------------------------------------------------------------------
[+] The game is over! Would you like to play again or quit? (Type 'quit' to exit or 'play' to start a new game):play

----------------------------------------------------------------------------------------------------------------
Choose a game to play:
1. Tic Tac Toe
2. Order and Chaos
3. Super Tic Tac Toe
Enter number of the game to play: 2

----------------------------------------------------------------------------------------------------------------
[+] Welcome to Order and Chaos

Reminder: The board size is 6x6 for Order and Chaos
Player 1 wins by connecting 5 (Order) and Player 2 wins if no 5 or more connections are made (Chaos)!

[+] Player 1, please enter your name: Jin
[+] Player 1, please choose your role (Order/Chaos): order
[+] Player 1: Jin is Order
[+] Player 2, please enter your name: Peng
[+] Player 2: Peng is Chaos

----------------------------------------------------------------------------------------------------------------
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
[+] Jin's (-) turn! Please enter a cell number: 
Enter a cell number: 1
Enter symbol to place (X/O): x
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
[+] Peng's (-) turn! Please enter a cell number: 
Enter a cell number: 7
Enter symbol to place (X/O): x
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       2       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      13       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+
[+] Jin's (-) turn! Please enter a cell number: 
Enter a cell number: 13
Enter symbol to place (X/O): x
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       2       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+
[+] Peng's (-) turn! Please enter a cell number: 
Enter a cell number: 2
Enter symbol to place (X/O): o
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       O       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      19       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+
[+] Jin's (-) turn! Please enter a cell number: 
Enter a cell number: 19
Enter symbol to place (X/O): x
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       O       |       3       |       4       |       5       |       6       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |       8       |       9       |      10       |      11       |      12       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |      14       |      15       |      16       |      17       |      18       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|       X       |      20       |      21       |      22       |      23       |      24       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      25       |      26       |      27       |      28       |      29       |      30       |
+---------------+---------------+---------------+---------------+---------------+---------------+
|      31       |      32       |      33       |      34       |      35       |      36       |
+---------------+---------------+---------------+---------------+---------------+---------------+
[+] Peng's (-) turn! Please enter a cell number: 
Enter a cell number: 25
Enter symbol to place (X/O): x
Order wins!
Peng wins!

----------------------------------------------------------------------------------------------------------------
[+] The game is over! Would you like to play again or quit? (Type 'quit' to exit or 'play' to start a new game):quit
Thanks for playing. Goodbye!
