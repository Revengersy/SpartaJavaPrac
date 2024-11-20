package Calculators.level.three;

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
        if (results.isEmpty()) {
            System.out.println("최근 결과가 없습니다. (null 처리)");
            return null;
        }
        return results.getLast();
    }

    public static void setCurrentResult(double num) {
        if (results.isEmpty()) {
            results.addLast(num);
            return;
        }
        results.removeLast();
        results.addLast(num);
    }

    public static void deleteFirstResult() {
        if (results.isEmpty()) {
            results.removeFirst();
            return;
        }
        results.removeFirst();
    }

    public static void printResultsGreaterThan(double num) {
        results.stream()
                .filter(result -> result > num)
                .forEach(System.out::println);
    }
}
