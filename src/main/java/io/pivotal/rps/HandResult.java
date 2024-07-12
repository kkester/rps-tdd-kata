package io.pivotal.rps;

import java.util.Map;

import static io.pivotal.rps.Hand.*;
import static io.pivotal.rps.Result.*;

public interface HandResult {

    Map<Hand, HandResult> handResultMap = Map.of(
        ROCK, p2Hand -> p2Hand.equals(SCISSORS) ? P1_WINS : P2_WINS,
        PAPER, p2Hand -> p2Hand.equals(ROCK) ? P1_WINS : P2_WINS,
        SCISSORS, p2Hand -> p2Hand.equals(PAPER) ? P1_WINS : P2_WINS
    );

    static HandResult findByHand(Hand hand) {
        return handResultMap.get(hand);
    }

    default Result resultAgainst(Hand p1Hand, Hand p2Hand) {
        return p1Hand.equals(p2Hand) ? DRAW : determineResult(p2Hand);
    }

    Result determineResult(Hand p2Hand);
}
