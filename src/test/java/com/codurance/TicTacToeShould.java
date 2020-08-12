package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.BDDAssertions.thenThrownBy;
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
  void not_allow_x_to_be_outside_of_the_board() {
    Exception exception = assertThrows(RuntimeException.class, () -> ticTacToe.play(5, 2));
    assertThat(exception.getMessage()).isEqualTo("X is outside board");
  }

  @Test
  void not_allow_y_to_be_outside_of_the_board() {
    Exception exception = assertThrows(RuntimeException.class, () -> ticTacToe.play(2, 5));
    assertThat(exception.getMessage()).isEqualTo("Y is outside board");
  }

  @Test
  void not_allow_playing_the_same_square_twice() {
    ticTacToe.play(1, 1);
    thenThrownBy(() -> ticTacToe.play(1, 1))
        .isInstanceOf(RuntimeException.class)
        .hasMessage("Square occupied");
  }
}
