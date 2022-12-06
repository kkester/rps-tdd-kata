package io.pivotal.rps;

import static io.pivotal.rps.Hand.*;
import static io.pivotal.rps.Result.*;

public class Rps {
    public Result play(Hand p1Hand, Hand p2Hand) {
        if (p1Hand == p2Hand) {
            return DRAW;
        }
        return p1Wins(p1Hand, p2Hand) ? P1_WINS : P2_WINS;
    }

    private boolean p1Wins(Hand p1Hand, Hand p2Hand) {
        return (p1Hand == PAPER && p2Hand == ROCK) ||
            (p1Hand == ROCK && p2Hand == SCISSORS) ||
            (p1Hand == SCISSORS && p2Hand == PAPER);
    }
}
