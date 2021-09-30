package com.comp152;

import java.util.Random;

public class GovernmentProgram {
    public String programName;
    public GovernmentProgram(){
        String[] programList = {"Medicare","Medicane","VA","ObamaCare","CongressCare"};
        var picker = new Random();
        var number = picker.nextInt(programList.length);
        programName = programList[number];

    }

    public void payBill(double cost){
        if(programName.equals("CongressCare"))
            System.out.println("CongressCare is paying a bill of cost "+cost+" and giving a kickback... um tip of "+cost*2);
        else if (programName.equals("Medicare"))
            System.out.println("Medicare is paying "+cost+" welcome senior citizen");
        else
            System.out.println(programName+" is paying "+cost);

    }
}
