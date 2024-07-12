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
        if (hand.equals(other)) {
            return Result.DRAW;
        }
        return winHand.equals(other) ? Result.P1_WINS : Result.P2_WINS;
    }
}
