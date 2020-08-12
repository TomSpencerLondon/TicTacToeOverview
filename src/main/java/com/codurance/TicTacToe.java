package com.codurance;

public class TicTacToe {

  private Character[][] board = {
      new Character[]{'O', 'O', 'O'},
      new Character[]{'O', 'O', 'O'},
      new Character[]{'O', 'O', 'O'}
  };

  public void play(int x, int y) {
    if (x < 1 || x > 3) {
      throw new RuntimeException("X is outside board");
    } else if (y < 1 || y > 3) {
      throw new RuntimeException("Y is outside board");
    }
    if (board[x - 1][y - 1] != 'O'){
      throw new RuntimeException("Square occupied");
    } else {
      board[x - 1][y - 1] = 'X';
    }
  }
}
