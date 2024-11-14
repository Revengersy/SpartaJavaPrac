package Calculators;

import java.util.Scanner;

public class LvTwoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorLvTwo calculator = new CalculatorLvTwo();

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int int1 = sc.nextInt();

            System.out.println("두 번재 숫자를 입력하세요: ");
            int int2 = sc.nextInt();
            sc.nextLine();

            System.out.println("연산자를 입력하세요(+, -, *, /): ");
            String operator = sc.nextLine();

            calculator.calculate(int1, int2, operator);

            System.out.println("결과값 재확인");
            System.out.println(calculator.getCurrentResult());

            System.out.println("종료하시겠습니까? (종료하려면 exit 입력, 아니면 아무 값이나 입력)");
            if(sc.nextLine().equals("exit")){
                System.out.println("종료합니다");
                break;
            }
        }
        System.out.println("최종결과: ");
        System.out.println(calculator.getResults());

//        System.out.println("테스트 - 마지막 값 변경: ");
//        calculator.setCurrentResult(55);
//        System.out.println(calculator.getResults());

        sc.close();
    }
}
