package io.pivotal.rps;

import java.util.Objects;

import static io.pivotal.rps.Hand.*;
import static io.pivotal.rps.Result.*;

public class Rps {
    public Result play(Hand p1Hand, Hand p2Hand) {
        if (Objects.equals(p1Hand, p2Hand)) {
            return DRAW;
        }
        return switch(p1Hand) {
            case ROCK -> SCISSORS.equals(p2Hand) ? P1_WINS : P2_WINS;
            case PAPER -> ROCK.equals(p2Hand) ? P1_WINS : P2_WINS;
            case SCISSORS -> PAPER.equals(p2Hand) ? P1_WINS : P2_WINS;
        };
    }
}
