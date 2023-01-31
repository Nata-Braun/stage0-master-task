package com.epam.conditions;

public class IntegerDivider {
    private int dividend; private int divider;
    public void printCompletelyDivided(int dividend, int divider) {
        int res = 0;
        if (divider!=0){
            res = dividend / divider;
        } else {
            System.out.println("division by zero");
            return;
        }
        if (divider*res == dividend) {
            System.out.println("can be divided completely");
        }else {
            System.out.println("cannot be divided completely");

        }
    }

}
