package io.pivotal.rps;

public class Rps {
    public Result play(Hand p1Hand, Hand p2Hand) {
        return HandResult.findByHand(p1Hand).resultAgainst(p1Hand,p2Hand);
    }
}
