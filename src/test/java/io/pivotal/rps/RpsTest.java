package io.pivotal.rps;

import org.junit.jupiter.api.Test;

import static io.pivotal.rps.Hand.*;
import static io.pivotal.rps.Result.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RpsTest {
    Rps rps = new Rps();

    @Test
    void rockVsRock() {
        assertEquals(DRAW, rps.play(ROCK, ROCK));
    }

    @Test
    void rockVsPaper() {
        assertEquals(P2_WINS, rps.play(ROCK, PAPER));
    }

    @Test
    void rockVsScissors() {
        assertEquals(P1_WINS, rps.play(ROCK, SCISSORS));
    }

    @Test
    void paperVsRock() {
        assertEquals(P1_WINS, rps.play(PAPER, ROCK));
    }

    @Test
    void paperVsPaper() {
        assertEquals(DRAW, rps.play(PAPER, PAPER));
    }

    @Test
    void paperVsScissors() {
        assertEquals(P2_WINS, rps.play(PAPER, SCISSORS));
    }

    @Test
    void scissorsVsRock() {
        assertEquals(P2_WINS, rps.play(SCISSORS, ROCK));
    }

    @Test
    void scissorsVsPaper() {
        assertEquals(P1_WINS, rps.play(SCISSORS, PAPER));
    }

    @Test
    void scissorsVsScissors() {
        assertEquals(DRAW, rps.play(SCISSORS, SCISSORS));
    }
}
