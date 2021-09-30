package com.comp152;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;

    }
    public void getTreated(){
        System.out.println("I fell so much better " +name+" is treated");
    }
    public void payBill(double cost){
        System.out.println("Ouch my name is "+name+" and I just got my bill of "+cost);
    }

}
