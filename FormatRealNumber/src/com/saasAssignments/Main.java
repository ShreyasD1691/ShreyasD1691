package com.saasAssignments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Real Positive Number:");

        boolean isDouble = false;
        isDouble = scanner.hasNextDouble();
        if(isDouble) {
            inputNum = scanner.nextLine();
            inputNum = inputNum.replace(".", "@");
            String numSplit[] = inputNum.split("@", 2);
            FormatRealNumber formatRealNum = new FormatRealNumber(numSplit[0], numSplit[1]);
            System.out.println("Formatted number is " + formatRealNum.getFormattedString());
        }else{
            System.out.println("Invalid Real number");
        }
        scanner.close();
    }
}