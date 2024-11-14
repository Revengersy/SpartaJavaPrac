package Calculators;

import java.util.Scanner;

public class LvTwoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int int1 = sc.nextInt();

        System.out.println("두 번재 숫자를 입력하세요: ");
        int int2 = sc.nextInt();
        sc.nextLine();

        System.out.println("연산자를 입력하세요(+, -, *, /): ");
        String operator = sc.nextLine();

        CalculatorLvTwo calculator = new CalculatorLvTwo();
        calculator.calculate(int1, int2, operator);

        System.out.println(calculator.getResults());

        sc.close();
    }
}
