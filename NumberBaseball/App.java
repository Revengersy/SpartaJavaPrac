package NumberBaseball;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello Baseball");

        final int BASEBALL_ROUND = 3;
//        야구 길이 상수 선언?
        int[] answers = {1, 2, 3};
//        숫자는 셋 다 달라야 함
        int[] trials = {1, 4, 5};

        for (int i = 0; i < BASEBALL_ROUND; i ++){
            trials[i] = Integer.parseInt(getValidInputWithRegex("[0-9]"));
        }
        System.out.println("입력 종료 ");

//        숫자는 셋 다 달라야 함
        int[] results = {0, 0, 0};
//        첫번째는 S, 두 번째는 B
        for(int i = 0; i < BASEBALL_ROUND; i++){
            if(answers[i] == trials[i]){
                results[0]++;
            }
            for (int j = 0; j < BASEBALL_ROUND; j++){
                if(answers[i] == trials[j] && i != j){
                    results[1]++;
                }
            }
        }
        results[2] = 3 - (results[0] + results[1]);

        System.out.printf("%s 결과: %d %n", "Strike", results[0]);
        System.out.printf("%s 결과: %d %n", "Ball", results[1]);
        System.out.printf("%s 결과: %d %n", "Out", results[2]);

//        AI: 3자리 정답 저장
//        플레이어: 정답 입력(3자리 숫자)
//        ㄴ결과 정답을 비교
//        ㄴhistory: 비교 결과 저장
//        displayer:
//        ㄴhistory 표현
//
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
