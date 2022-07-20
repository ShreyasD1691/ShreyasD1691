package com.saasAssignments;

public class FormatRealNumber {
    private int intNum;
    private int fractNum;
    private String formattedFract;
    private int formattedInt;

    public int getIntNum() {
        return intNum;
    }

    public int getFractNum() {
        return fractNum;
    }

    public String getFormattedFract() {
        return formattedFract;
    }

    public int getFormattedInt() {
        return formattedInt;
    }

    public FormatRealNumber(String realNum, String fractNum) {
        this.intNum = Integer.parseInt(realNum);
        this.fractNum = Integer.parseInt(fractNum);
        this.formattedInt = intNum;
        this.formattedFract = Integer.toString(this.fractNum);
        //this.formattedFract = "";
        //this.formattedInt = 0;
        //this.formattedString = null;
    }

    private void formatFractNum(){
        if(fractNum != 0){
            while(formattedFract.length() < 5){
                formattedFract += "#";
            }
        } else {
            formattedFract = "#####";
        }
    }

    private void formatIntNum(){
        if(formattedInt != 0) {
            while (formattedInt % 10 == 0) {
                formattedInt = formattedInt / 10;
            }
        }else{
            formattedInt = -1;
        }
    }

    public String getFormattedString() {
        formatFractNum();
        formatIntNum();
        if(formattedInt == -1){
            return formattedFract;
        }else {
            return formattedFract + "." + formattedInt;
        }
    }
}
