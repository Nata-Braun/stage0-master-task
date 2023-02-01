package com.epam.loops;

public class Power {
    private int numberToPrint; private int power;
    public void printPower(int numberToPrint, int power) {
        int result=1;
        if (power==0){
            result=1;
        } else if (power==1) {
            result=numberToPrint;

        } else if (power>1) {
            for (int i=1; i <= power; i++) {
                result = result * numberToPrint;
            }
        } else if (power<0) {
                for (int i=2; i<=power; i++){
                result = 1 / result * numberToPrint;
                }
            }
        System.out.println(result);
        }


    public static void main(String[] args) {
        new Power().printPower(10, 3);

    }

}
