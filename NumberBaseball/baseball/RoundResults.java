package NumberBaseball.baseball;

import java.util.ArrayList;

public class RoundResults {
    private static ArrayList<RoundResult> results  = new ArrayList<>();

    private RoundResults() {
        results = new ArrayList<>();
    }

    public static void addResult(RoundResult result) {
        results.add(result);
    }

    public static ArrayList<RoundResult> getResults() {
        return results;
    }

    public static void printResults() {
        for (int i = 0; i < results.size(); i++) {

            int[] expectation = results.get(i).getPitchingExpectation();
            int[] result = results.get(i).getPitchingResult();

            System.out.println();
            System.out.printf("-----이전 %d 번째 시도----- %n", i + 1);
            for (int j = 0; j < expectation.length; j++) {
                System.out.printf("%d  ", expectation[j]);
            }
            System.out.println();
            System.out.printf("Strike : %d, Ball : %d, Out : %d %n", result[0], result[1], result[2]);
        }
    }
}
