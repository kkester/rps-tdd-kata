package io.pivotal.rps;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import static io.pivotal.rps.Result.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RpsTest {

    Rps rps = new Rps();

    @ParameterizedTest
    @EnumSource(Hand.class)
    void handVsHandDraw(Hand hand) {
        assertEquals(DRAW, rps.play(hand, hand));
    }

    @ParameterizedTest
    @CsvSource({"ROCK,SCISSORS", "PAPER,ROCK", "SCISSORS,PAPER"})
    void handVsHandP1Wins(Hand p1Hand, Hand p2Hand) {
        assertEquals(P1_WINS, rps.play(p1Hand, p2Hand));
    }

    @ParameterizedTest
    @CsvSource({"SCISSORS,ROCK", "ROCK,PAPER", "PAPER,SCISSORS"})
    void handVsHandP2Wins(Hand p1Hand, Hand p2Hand) {
        assertEquals(P2_WINS, rps.play(p1Hand, p2Hand));
    }
}
