package io.pivotal.rps;

public enum Hand {
    PAPER("ROCK"),
    ROCK("SCISSORS"),
    SCISSORS("PAPER");

    private String dominateHandName;

    Hand(String dominateHandName) {
        this.dominateHandName = dominateHandName;
    }

    public Result resultAgainst(Hand hand) {
        return this.equals(hand) ? Result.DRAW : getResult(hand);
    }

    private Result getResult(Hand hand) {
        return Hand.valueOf(dominateHandName).equals(hand) ? Result.P1_WINS : Result.P2_WINS;
    }
}
