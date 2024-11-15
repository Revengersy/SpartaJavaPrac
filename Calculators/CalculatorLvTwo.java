package Calculators;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class CalculatorLvTwo {
    private static ArrayDeque<Double> results;

    public CalculatorLvTwo() {
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
        try {
            return results.getLast();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("연산 결과를 수행한 적이 없습니다.");
            return null;
        }
    }

    public void setCurrentResult(double num) {
        try {
            results.removeLast();
            results.addLast(num);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("저장된 연산 결과가 없습니다");
        }
    }

    public void deleteFirstResult() {
        try {
            results.removeFirst();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("저장된 연산 결과가 없습니다.");
        }
    }
}

