package com.epam.loops;

public class Pyramid {
    private int cathetusLength;
    public void printPyramid(int cathetusLength) {
        String piramid = "";
        for (int i = 0; i <= cathetusLength; i++) {
            for (int j = cathetusLength-1; j > 0; j--) {

            }
        }
    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
