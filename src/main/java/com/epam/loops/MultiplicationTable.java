package com.epam.loops;

public class MultiplicationTable {
    private int numberTableToPrint;

    public void printTable(int numberTableToPrint) {
        for (int i=1; i<=10;i++){
            int multi = numberTableToPrint*i;
            System.out.println(Integer.toString(i) +" x " + Integer.toString(numberTableToPrint) + " = " + Integer.toString(multi));
        }
    }

}
