package NumberBaseball;

import NumberBaseball.baseball.RoundAssigner;
import NumberBaseball.baseball.RoundResult;
import NumberBaseball.baseball.RoundResults;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        RoundAssigner roundAssigner = RoundAssigner.getInstance(3);
        final int BASEBALL_ROUND = roundAssigner.getRoundNumber();

        int[] answers = {3, 1, 9};
//        숫자는 셋 다 달라야 함

        Integer round = 0;
        while (true) {
            int[] trials = new int[BASEBALL_ROUND];
            HashMap<String, Integer> baseballPitchingMap = new HashMap<>();
            baseballPitchingMap.put("Strike", 0);
            baseballPitchingMap.put("Ball", 0);
            baseballPitchingMap.put("Out", 0);
            int[] results = new int[3];

            for (int i = 0; i < BASEBALL_ROUND; i++) {
                trials[i] = Integer.parseInt(getValidInputWithRegex("[0-9]"));
            }
            System.out.println("입력 종료 ");

            for (int i = 0; i < BASEBALL_ROUND; i++) {
                if (answers[i] == trials[i]) {
                    baseballPitchingMap.put("Strike", baseballPitchingMap.get("Strike") + 1);
                }
                for (int j = 0; j < BASEBALL_ROUND; j++) {
                    if (answers[i] == trials[j] && i != j) {
                        baseballPitchingMap.put("Ball", baseballPitchingMap.get("Ball") + 1);
                    }
                }
            }
            baseballPitchingMap.put("Out", BASEBALL_ROUND - (baseballPitchingMap.get("Strike") + baseballPitchingMap.get("Ball")));

            System.out.printf("%s 결과: %d %n", "Strike", results[0]);
            System.out.printf("%s 결과: %d %n", "Ball", results[1]);
            System.out.printf("%s 결과: %d %n", "Out", results[2]);

            RoundResults.addResult(new RoundResult(trials, results, roundAssigner));
            System.out.println("저장됨");


            System.out.println("지금까지의 결과");
            RoundResults.printResults();
        }


//        AI: 3자리 정답 저장
//        플레이어: 정답 입력(3자리 숫자)
//        ㄴ결과 정답을 비교
//        ㄴhistory: 비교 결과 저장
//        displayer:
//        ㄴhistory 표현
//        hiostory 인쇄
//

    }

    public static String getValidInputWithRegex(String regex){
        System.out.println("0부터 9까지 숫자를 입력해주세요");
        while (!sc.hasNext(regex)) {
            System.out.println("잘못된 입력입니다. 다시 조건에 맞게 입력해주세요.");
            sc.next();
        }
        return sc.next();
    }

}
