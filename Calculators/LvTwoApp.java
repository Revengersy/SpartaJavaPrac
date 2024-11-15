package Calculators;

import java.util.Scanner;

public class LvTwoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorLvTwo calculator = new CalculatorLvTwo();

        while (true) {
            int int1 = getPositiveNumber(sc, "첫 번째 숫자를 입력하세요: ");
            int int2 = getPositiveNumber(sc, "두 번째 숫자를 입력하세요: ");

            System.out.println("연산자를 입력하세요(+, -, *, /): ");
            String operator = sc.nextLine();

            calculator.calculate(int1, int2, operator);

            System.out.println("결과값 재확인");
            System.out.println(calculator.getCurrentResult());

            System.out.println("종료하시겠습니까? (종료하려면 exit 입력, 아니면 아무 값이나 입력)");
            if (sc.nextLine().equals("exit")) {
                System.out.println("종료합니다");
                break;
            }
        }

        System.out.println("최종결과: ");
        System.out.println(calculator.getResults());

        System.out.println("테스트 - 마지막 값 55로 변경: ");
        calculator.setCurrentResult(55);
        System.out.println(calculator.getResults());

        System.out.println("테스트 - 첫 째 값 제거 ");
        calculator.deleteFirstResult();
        System.out.println(calculator.getResults());

        sc.close();
    }

    public static int getPositiveNumber(Scanner sc, String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseUnsignedInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("양의 정수 값을 입력해 주세요.");
            }
        }
    }
}
