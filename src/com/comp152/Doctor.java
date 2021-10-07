package com.comp152;

public class Doctor {
    private double fee;
    protected String AlmaMater;
    public Doctor(double cost, String MedSchool){
        fee = cost;
        AlmaMater = MedSchool;

    }
    @Override
    public String toString(){
        return "doctor from "+AlmaMater+" who charges "+fee;
    }
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Doctor))
            return false;
        Doctor otherDoctor = (Doctor) other;
        var isSame = this.fee == otherDoctor.fee && this.AlmaMater == otherDoctor.AlmaMater;
        return isSame;

    }

    public void treatPatient(Person patient){
        System.out.println("Take two of these and call the office in the morning");
        patient.getTreated();
    }
    public double billPatient(Person patient){
        patient.payBill(fee);
        return fee;
    }
    public double billPatient(boolean isMedicare, GovernmentProgram govProgram){
        var billedCost = 0.0;
        if(isMedicare)
            billedCost = fee/2;
        else
            billedCost = fee;
        govProgram.payBill(billedCost);
        return billedCost;

    }

}
