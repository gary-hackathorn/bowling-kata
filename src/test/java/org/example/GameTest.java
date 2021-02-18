package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest{
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    private void rollMany(int pins, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void allGutterBalls()  {
        rollMany(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        rollMany(1, 20);
        assertEquals(20, game.score());
    }

    @Test
    @DisplayName("A spare fulled by 3 pull all 0s = 16")
    public void aSpare() {
        game.rollMulti(1,9,3);
        rollMany(0, 17);
        assertEquals(16, game.score());
    }

    @Test
    @DisplayName("10 folled by 3 and 4 plus all misses = 244")
    public void testStrike() {
        game.rollMulti(10, 3,4);
        rollMany(0, 16);
        assertEquals(24, game.score());
    }
    @Test
    @DisplayName("A perfect score 12 strikes = 300")
    public void perfectGame() {
        rollMany(10, 12);
        assertEquals(300, game.score());
    }
}
//Uncle Bob breaks this kata down into the following five tests:
//
// 1.Gutter game scores zero - When you roll all misses, you get a total score of zero.
// 2.All ones scores 20 - When you knock down one pin with each ball, your total score is 20.
// 3.A spare in the first frame, followed by three pins, followed by all misses scores 16.
// 4.A strike in the first frame, followed by three and then four pins, followed by all misses, scores 24.
// 5.A perfect game (12 strikes) scores 300.
