package com.comp152;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Person sickPerson1 = new Person("Stu Dent");
        Person sickPerson2 = new Person("Any Body");
        var govProg = new GovernmentProgram();
        var inNetworkDoctors = new ArrayList<Doctor>();
        inNetworkDoctors.add(new Doctor(500, "State University"));
        inNetworkDoctors.add(new Surgeon("Children's hospital"));
        var randomNumberGenerator = new Random();
        var choice = randomNumberGenerator.nextInt(inNetworkDoctors.size());
        var doc = inNetworkDoctors.get(choice);
        doc.treatPatient(sickPerson1);
        System.out.println(doc);
       // Doctor dr = new Doctor(300,"Expensive U");
        //var secondDR = new Surgeon("Children's Hospital");
        //dr.treatPatient(sickPerson1);
        //dr.billPatient(sickPerson1);
        //dr.treatPatient(sickPerson2);
        //dr.billPatient(false,govProg);
        //secondDR.treatPatient(sickPerson1);
        //secondDR.billPatient(sickPerson1);



    }
}
