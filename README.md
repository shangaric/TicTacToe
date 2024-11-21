# Tic Tac Toe

# Tic Tac Toe - A Childhood Classic in Java 🎮
Tic Tac Toe is a classic two-player game we all enjoyed during our childhood. Simple yet strategic, the game involves players taking turns to mark spaces in a 3x3 grid, aiming to align three of their symbols (either 'X' or 'O') horizontally, vertically, or diagonally.This repository contains a Java implementation of the timeless two-player game Tic Tac Toe. A simple yet strategic game we all loved during our childhood, this version is built with a dynamic and interactive console interface.

# 🚀 Features:
Dynamic Player Turns:
Players alternate between X and O to ensure fairness.

# Real-Time Board Display:
The grid updates after every move, displaying the current game state.

# Winning Logic:

    The game detects:
          Horizontal Wins
          Vertical Wins
          Diagonal Wins
          If no winner emerges after 9 moves, it declares a draw.
    Input Validation:
          Prevents overwriting marked spots.
          Ensures only valid moves are allowed.
    Game Conclusion:
          Announces the winner or a draw and exits gracefully.

# 🎮 How to Play:
    Run the program in any Java environment (IDE or terminal).
    Players take turns entering grid coordinates:
      i for the row (0-2).
      j for the column (0-2).
    The program validates the input and updates the grid.
    Keep playing until:
        A player aligns three of their symbols (X or O) horizontally, vertically, or diagonally.
        Or, all spaces are filled, resulting in a draw.
