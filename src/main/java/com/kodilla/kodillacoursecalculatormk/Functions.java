package com.kodilla.kodillacoursecalculatormk;

public class Functions {

    static public boolean checkIfNumber(String text) {

        if ( text == null ) {
            return false;
        }

        for (char c : text.toCharArray()) {
            if ( Character.isDigit(c) == false ) {
                return false;
            }
        }
        return true;
    }
}
