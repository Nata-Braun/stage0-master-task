package com.epam.langSyntax;

public class NumberReverter {
    private int number;

    public void revert(int number) throws IllegalArgumentException {

        int a1 = number % 10;
        int a2 = (number % 100 - a1) / 10;
        int a3 = (number - a1 - a2 * 10) / 100;
        System.out.println(a1 * 100 + a2 * 10 + a3);

    }


}



