package io.pivotal.rps;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class HandResult {

    private static Map<Hand, HandResult> handResultMap = Map.of(
            Hand.ROCK, HandResult.builder().hand(Hand.ROCK).winHand(Hand.SCISSORS).build(),
            Hand.PAPER, HandResult.builder().hand(Hand.PAPER).winHand(Hand.ROCK).build(),
            Hand.SCISSORS, HandResult.builder().hand(Hand.SCISSORS).winHand(Hand.PAPER).build()
    );

    private Hand hand;
    private Hand winHand;

    public static HandResult findByHand(Hand hand) {
        return handResultMap.get(hand);
    }

    public Result resultAgainst(Hand other) {
        Result result = Result.P2_WINS;
        if (hand.equals(other)) {
            result = Result.DRAW;
        } else if (winHand.equals(other)) {
            result = Result.P1_WINS;
        }
        return result;
    }
}
