package com.kodilla.kodillacoursecalculatormk;

public class Operators {
    private double result;

    public double getOperators(double value1, double value2, String operator) {
        if ( operator.equals("+")) {
            AddValues calculation = new AddValues();
            result = calculation.operation(value1, value2);
        }
        if ( operator.equals("-")) {
            SubtractValues calculation = new SubtractValues();
            result = calculation.operation(value1, value2);
        }
        if ( operator.equals("*")) {
            MultiplyValues calculation = new MultiplyValues();
            result = calculation.operation(value1, value2);
        }
        if ( operator.equals("/")) {
            DivideValues calculation = new DivideValues();
            result = calculation.operation(value1, value2);
        }
        return result;
    }
}
