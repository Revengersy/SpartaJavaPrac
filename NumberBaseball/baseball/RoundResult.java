package NumberBaseball.baseball;

import java.util.ArrayList;

public class RoundResult {
    private final int[] pitchingExpectation;
    private final int[] pitchingResult;
    private int roundNumber;

    public RoundResult(int[] pitchingExpectation, int[] pitchingResult, RoundAssigner roundAssigner) {
        this.pitchingExpectation = pitchingExpectation;
        this.pitchingResult = pitchingResult;
        this.roundNumber = roundAssigner.getRoundNumber();
    }

    public int[] getPitchingExpectation() {
        return this.pitchingExpectation;
    }

    public int[] getPitchingResult() {
        return this.pitchingResult;
    }

    public int getRoundNumber() {
        return this.roundNumber;
    }


}
