package com.kodilla.kodillacoursecalculatormk;

import java.util.ArrayDeque;

public class Calculator {
    private String sequence = "";
    private String sequenceItem = "";
    private ArrayDeque<Double> sequenceItems = new ArrayDeque<>();
    private double value1 = 0;
    private double value2 = 0;
    private double result = 0;
    private Operators operator = new Operators();

    public double calculate(String sequence) {

        if ( sequence.substring(sequence.length() - 1, sequence.length()).trim().isEmpty() == false) {
            sequence += " ";
        }

        for ( int i = 0 ; i < sequence.length() ; i++) {

            if ( sequence.substring(i,i + 1).trim().isEmpty() == false) {
                sequenceItem += sequence.substring(i,i + 1);
            } else {

                if ( Functions.checkIfNumber(sequenceItem) ) {
                    sequenceItems.push(Double.parseDouble(sequenceItem));
                    sequenceItem = "";
                } else {
                    value1 = sequenceItems.pop();
                    value2 = sequenceItems.pop();

                    result = operator.getOperators(value2,value1,sequenceItem);

                    sequenceItems.push(result);
                    sequenceItem = "";
                }
            }
        }
        return sequenceItems.pop();
    }
}

