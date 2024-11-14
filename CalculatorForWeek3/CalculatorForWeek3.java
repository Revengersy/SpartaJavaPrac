package CalculatorForWeek3;

import java.util.Scanner;

public class CalculatorForWeek3 {
    AbstractOperation operation;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연산자 값을 입력하세요(+, -, *, /) : ");
        String operator = sc.nextLine();

        System.out.println("첫 번째 값을 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 값을 입력하세요: ");
        int num2 = sc.nextInt();

        double result = calculate(operator, num1, num2);
        System.out.println("연산 결과: ");
        System.out.println(result);
    }

    public CalculatorForWeek3(){

    }

    public static double calculate(String operator, int num1, int num2) {
        double result;
        switch (operator) {
            case "+":
                result = addOperation.operate(num1, num2);
                break;
            case "-":
                result = subtractOperation.operate(num1, num2);
                break;
            case "*":
                result = multiplyOperation.operate(num1, num2);
                break;
            case "/":
                result = divideOperation.operate(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                result = 0;
                break;
        }
        return result;
    }
}


