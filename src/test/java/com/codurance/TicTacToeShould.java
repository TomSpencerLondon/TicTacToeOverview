package com.codurance;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeShould {

  private TicTacToe ticTacToe;


  @BeforeEach
  void setUp() {
    ticTacToe = new TicTacToe();
  }

  @Test
  void whenXOutsideBoardThenRuntimeException() {
    assertThrows(RuntimeException.class, () -> {
      ticTacToe.play(5, 2);
    });
  }
}
