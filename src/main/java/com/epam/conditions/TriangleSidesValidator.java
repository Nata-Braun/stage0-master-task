package com.epam.conditions;

public class TriangleSidesValidator {
    private double firstSide; private double secondSide; private double thirdSide;
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide<=0||secondSide<=0||thirdSide<=0 || firstSide+secondSide<=thirdSide||secondSide+thirdSide<=firstSide||thirdSide+firstSide<=secondSide) {
            System.out.println("it's not a triangle");
        }else {
            System.out.println("this is a valid triangle");
        }

    }

}
