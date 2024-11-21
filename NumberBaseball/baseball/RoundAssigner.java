package NumberBaseball.baseball;

public class RoundAssigner {
    private int roundNumber;
    private static RoundAssigner instance;

    private RoundAssigner(int number) {
        this.roundNumber = number;
    }

    public static RoundAssigner getInstance (int number) {
        if (instance == null){
            instance = new RoundAssigner(number);
        }
        return instance;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

}
