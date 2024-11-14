package Calculators;

import java.util.ArrayDeque;

public class CalculatorLvThree {
    private static ArrayDeque<Double> results;

    public CalculatorLvThree() {
        results = new ArrayDeque<>();
    }

    public void calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                results.add(num1 + num2);
                break;
            case "-":
                results.add(num1 - num2);
                break;
            case "*":
                results.add(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                results.add(num1 / num2);
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                break;
        }
    }

    public ArrayDeque<Double> getResults() {
        return results;
    }

    public Double getCurrentResult() {
        return results.getLast();
    }

    public void setCurrentResult(double num) {
        results.removeLast();
        results.addLast(num);
    }

    public void deleteFirstResult() {
        results.removeFirst();
    }
}
