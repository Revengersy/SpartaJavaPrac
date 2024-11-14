package CalculatorForWeek3;


public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot Divide by zero");
        }
        return num1 / num2;
    }
}
