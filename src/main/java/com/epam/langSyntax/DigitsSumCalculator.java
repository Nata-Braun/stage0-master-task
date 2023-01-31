package com.epam.langSyntax;

public class DigitsSumCalculator {
    private int number;
    public void calculateSum(int number) {
        int summ = 0;
        for (int i=1; i<=4; i++){
            summ = summ+number%10;
            number=number/10;
        }

        System.out.println(summ);
    }

}
