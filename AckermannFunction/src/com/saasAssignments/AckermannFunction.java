package com.saasAssignments;

public class AckermannFunction {
    private int num1;
    private int num2;
    private int result;

    public AckermannFunction(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }

    private int calculateResult(int num1, int num2){
        if(num1 == 0){
            result = num2 + 1;
        } else if(num2 == 0){
            result = calculateResult(num1 - 1, 1);
        } else {
            result = calculateResult(num1 - 1, calculateResult(num1, num2 - 1));
        }
        return result;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResult() {
        return calculateResult(num1, num2);
    }
}
