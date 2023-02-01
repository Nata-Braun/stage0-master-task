package com.epam.conditions;

public class BitwiseValuesSwap {
private int first; private int second;
    public void swap(int first, int second) {
        first=first^second;
        second=first^second;
        first=first^second;
        System.out.println(first);
        System.out.println(second);
    }

}
