package Calculators;

import java.util.Scanner;

public class LvThreeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorLvThree<Integer> intCalculator = new CalculatorLvThree<Integer>();
        CalculatorLvThree<Double> doubleCalculator = new CalculatorLvThree<Double>();

        while (true) {
            System.out.println("---------------------------------------");

            int int1 = getPositiveNumber(sc, "(정수입력) 첫 번째 숫자를 입력하세요: ");
            int int2 = getPositiveNumber(sc, "(정수입력) 두 번째 숫자를 입력하세요: ");
            CalculationType operator = getProperOperator(sc);

            intCalculator.calculate(int1, int2, operator);

            System.out.println("정산적으로 연산된 가장 최근의 연산 결과");
            System.out.println(CalculatorLvThree.getCurrentResult());

            System.out.println("---");
            System.out.println();

            System.out.println("(실수입력) 첫 번째 숫자를 입력하세요: ");
            double double1 = sc.nextDouble();

            System.out.println("(실수입력) 두 번재 숫자를 입력하세요: ");
            double double2 = sc.nextDouble();
            sc.nextLine();

            CalculationType operator2 = getProperOperator(sc);

            doubleCalculator.calculate(double1, double2, operator2);

            System.out.println("정산적으로 연산된 가장 최근의 연산 결과");
            System.out.println(CalculatorLvThree.getCurrentResult());

            System.out.println("종료하시겠습니까? (종료하려면 exit 입력, 아니면 아무 값이나 입력)");
            if (sc.nextLine().equals("exit")) {
                System.out.println("종료합니다");
                break;
            }
        }
        System.out.println("최종결과: ");
        System.out.println(CalculatorLvThree.getResults());

        System.out.println("테스트 - 마지막 값 55로 변경: ");
        CalculatorLvThree.setCurrentResult(55);
        System.out.println(CalculatorLvThree.getResults());

        CalculatorLvThree.printResultsGreaterThan(2);

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

    public static CalculationType getProperOperator(Scanner sc) {
        while (true) {
            try {
                System.out.print("연산자를 입력하세요(대소문자 구분 없음: ");
                for (CalculationType type : CalculationType.values()) {
                    System.out.print(type + " ");
                }
                System.out.print(")");
                System.out.println();
                return CalculationType.valueOf(sc.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("올바른 연산자를 입력하세요");
            }
        }
    }
}
