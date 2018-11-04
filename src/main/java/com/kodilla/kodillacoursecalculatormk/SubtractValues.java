package com.kodilla.kodillacoursecalculatormk;

public class SubtractValues implements CalculatorInterface {
    public double operation(double val1, double val2) {
        return val1 - val2;
    }

    public String getOperator() {
        return "-";
    }
}


