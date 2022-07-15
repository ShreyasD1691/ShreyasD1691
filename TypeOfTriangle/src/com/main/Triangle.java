package com.main;

/* Assignment Description
Write a program that reads three real numbers and finds out whether they can be the sides of the triangle and if they do,
prints what type of triangle it is. Even though all equilateral triangles are isosceles, your program should classify an equilateral triangle
to be an equilateral only. Similarly isosceles right-angled triangles should be classified as right-angled and not isosceles.
A valid triangle which does not belong to any of the special types belongs to the notspecial category.
The three sides will be given as real numbers separated by blanks. The program should print the type of the triangle in words
using lower case letters followed by eoln without any blanks

Possible answers are:
 invalid
 right-angled
 isosceles
 equilateral
 notspecial

Consider a triangle with three sides measuring a, b, and c units. A triangle is a right-angled triangle if
       a2 + b2 = c2
Allow a tolerance of 0.000001 in the comparison in the above case i.e
        a2 + b2 = c2 +/- 0.000001

A triangle is an isosceles triangle if any two of its sides are equal.
A triangle is an equilateral triangle if all the three sides are equal.
Three values can be the dimensions of a triangle if and only if the sum of every pair of values is greater than the third value. Otherwise, it is an invalid triangle.
 */

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private String type;

    public Triangle(double side1, double side2, double side3) {
        if((side1 + side2 < side3) || (side2 + side3 < side1) || (side1 + side3 < side2)){
            this.type = "invalid";
        }else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            typeOfTriangle();
        }
    }

    public void typeOfTriangle(){
        if(isRightAngle()){
            type = "right-angled";
        } else if(isEquilateral()){
            type = "equilateral";
        } else if(isIsosceles()) {
            type = "isosceles";
        } else {
            type = "notspecial";
        }
    }

    public boolean isRightAngle(){
        if((round((Math.pow(side1,2.0) + Math.pow(side2,2.0)),6) == round(Math.pow(side3,2.0),6)) ||
                (round((Math.pow(side1,2.0) + Math.pow(side3,2.0)),6) == round(Math.pow(side2,2.0),6)) ||
                (round((Math.pow(side3,2.0) + Math.pow(side2,2.0)),6) == round(Math.pow(side1,2.0),6))){
            return true;
        } else {
            return false;
        }
    }

    public boolean isIsosceles(){
        if((side1 == side2) || (side2 == side3) || (side1 == side3)){
            return true;
        } else{
            return false;
        }
    }

    public boolean isEquilateral(){
        if((side1 == side2) && (side2 == side3)) {
            return true;
        }
        else {
            return false;
        }
    }

    public double round(double num, int precision){
        double factor = Math.pow(10,precision);
        return Math.round(num*factor)/factor;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getType() {
        return type;
    }
}
