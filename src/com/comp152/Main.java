package com.comp152;

public class Main {

    public static void main(String[] args) {
        Person sickPerson1 = new Person("Stu Dent");
        Person sickPerson2 = new Person("Any Body");
        var govProg = new GovernmentProgram();
        Doctor dr = new Doctor(300,"Expensive U");
        dr.treatPatient(sickPerson1);
        dr.billPatient(sickPerson1);
        dr.treatPatient(sickPerson2);
        dr.billPatient(false,govProg);
        

    }
}
