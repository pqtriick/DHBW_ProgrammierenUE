package de.pqtriick.Kap3.K3_1;

import java.util.Date;

public class Racoon {

    private int age;
    private Date date;

    public Racoon() {

    }

    public Racoon(int age, Date date) {
        this.age = age;
        this.date = date;
    }

    public void printState() {
        System.out.println("Age: " + age + " | Datum: " + date);
    }
}
