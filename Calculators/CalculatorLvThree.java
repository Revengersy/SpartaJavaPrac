package Calculators;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class CalculatorLvThree<T extends Number> {
    private static ArrayDeque<Double> results = new ArrayDeque<>();

    public void calculate(T num1, T num2, CalculationType operator) {
        switch (operator) {
            case PLUS:
                results.add(num1.doubleValue() + num2.doubleValue());
                break;
            case MINUS:
                results.add(num1.doubleValue() - num2.doubleValue());
                break;
            case MULTIPLY:
                results.add(num1.doubleValue() * num2.doubleValue());
                break;
            case DIVIDE:
                if (num2.doubleValue() == 0.0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                results.add(num1.doubleValue() / num2.doubleValue());
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                break;
        }
    }

    public static ArrayDeque<Double> getResults() {
        return results;
    }

    public static Double getCurrentResult() {
        try {
            return results.getLast();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("연산 결과를 수행한 적이 없습니다.");
            return null;
        }
    }

    public static void setCurrentResult(double num) {
        try {
            results.removeLast();
            results.addLast(num);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("저장된 연산 결과가 없습니다");
        }
    }

    public static void deleteFirstResult() {
        try {
            results.removeFirst();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("저장된 연산 결과가 없습니다.");
        }
    }

    public static void printResultsGreaterThan(double num) {
        results.stream()
                .filter(result -> result > num)
                .forEach(System.out::println);
    }
}
