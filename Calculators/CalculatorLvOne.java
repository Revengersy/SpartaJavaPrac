package Calculators;

import java.util.Scanner;


// 추후 학습 내용이 더해지면 연산자, num1, num2 입력을 제대로 처리할 것
// 지금은 연산자, num1, num2가 제대로 입력된다고 가정하며
// 잘못된 값이 입력되면 그 즉시 프로그램이 터지도록 기획


public class CalculatorLvOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------");
            System.out.println("새로운 연산을 시작합니다");

            String[] operators = {"+", "-", "*", "/"};
            System.out.println("연산자를 입력해 주세요.(+, -, *, /)");
            String operator = sc.nextLine();
            for (String op : operators) {
                if (operator.equals(op)){
                    break;
                } else {
                    System.out.println("잘못된 연산자 입력");
                    return;
                }

            }

            System.out.println("num1을 입력해주세요");
            String tmp1 = sc.nextLine();
            int num1 = Integer.parseUnsignedInt(tmp1);

            System.out.println("num2를 입력해주세요");
            String tmp2 = sc.nextLine();
            int num2 = Integer.parseUnsignedInt(tmp2);

            switch (operator) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }
                    System.out.println(num1 / num2);
                    break;
                default:
                    assert (false) : "unknown case";
                    break;
            }

            System.out.println("연산 종료 실행? (exit를 입력하면 종료. 그 외의 경우 반복)");
            String exit = sc.nextLine();
            if (exit.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }
        }

        sc.close();

    }
}
