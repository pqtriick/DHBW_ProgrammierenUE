package de.pqtriick.Kap3.K3_1;

import java.util.Date;

public class RacoonApp {

    public static void main(String[] args) {
        Racoon racoon = new Racoon();
        Racoon racoon1 = new Racoon(2, new Date());

        racoon.printState();
        racoon1.printState();
    }
}
