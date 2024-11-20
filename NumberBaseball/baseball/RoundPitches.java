package NumberBaseball.baseball;

import java.util.ArrayList;

public class RoundPitches {
    private ArrayList<Integer> pitches;

    private RoundPitches(ArrayList<Integer> pitches, final int MAX_ROUNDS) {
        if (pitches.size() > MAX_ROUNDS) {
            throw new IllegalArgumentException();
        }
        this.pitches = pitches;
    }

    public ArrayList<Integer> getPitches(){
        return this.pitches;
    }

}
