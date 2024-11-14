package CalculatorForWeek3;

import java.util.Scanner;

public class CalculatorForWeek3 {
    AbstractOperation operation;

    public CalculatorForWeek3(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int num1, int num2) {
        return operation.operate(num1, num2);
    }


}


