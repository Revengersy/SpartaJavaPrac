package CalculatorForWeek3;

public class MainWeek3 {
    public static void main(String[] args) {
        CalculatorForWeek3 calculator = new CalculatorForWeek3(new AddOperation());
        System.out.println("Addition: " + calculator.calculate(5, 3));

        calculator.setOperation(new SubtractOperation());
        System.out.println("Subtraction: " + calculator.calculate(5, 3));

        calculator.setOperation(new MultiplyOperation());
        System.out.println("Multiplication: " + calculator.calculate(5, 3));

        calculator.setOperation(new DivideOperation());
        System.out.println("Division: " + calculator.calculate(5, 3));
    }
}
