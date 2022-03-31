package com.mthree.Enums.MathOperators;

enum MathOperator{
    PLUS, MINUS, MULTIPLY, DIVIDE
}
public class IntMath {
    public int calculate(MathOperator operator, int operand1, int operand2) {
        switch(operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        String ops = "MULTIPLY";
        IntMath operation = new IntMath();
        int res = operation.calculate(MathOperator.valueOf(ops), num1, num2);
        System.out.println(res);
    }

}
