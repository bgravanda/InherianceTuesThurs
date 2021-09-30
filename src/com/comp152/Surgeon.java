package com.comp152;

import java.util.Random;

public class Surgeon extends Doctor{
    private String hospital;
    public Surgeon(String hospital){
        super(999.99, "Fancy Name Brand School");
        this.hospital = hospital;
    }
    public void treatPatient(Person patient){
        var hoursPicker = new Random();
        System.out.println("After "+hoursPicker.nextInt(8)+" hours of surgery at "+hospital+ "our patient should be on the mend");
        patient.getTreated();

    }

}
