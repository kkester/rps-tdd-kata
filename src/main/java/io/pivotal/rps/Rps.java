package io.pivotal.rps;

import static io.pivotal.rps.Hand.*;
import static io.pivotal.rps.Result.*;

public class Rps {
    public Result play(Hand p1Hand, Hand p2Hand) {
        if (p1Hand == p2Hand) {
            return DRAW;
        }

        return switch(p1Hand) {
            case ROCK -> p2Hand == SCISSORS ? P1_WINS : P2_WINS;
            case PAPER -> p2Hand == ROCK ? P1_WINS : P2_WINS;
            case SCISSORS -> p2Hand == PAPER ? P1_WINS : P2_WINS;
        };
    }
}
