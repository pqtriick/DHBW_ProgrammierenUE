package de.pqtriick.Kap4.K4_1;

public class TestBruch {

    public static void main(String[] args) {
        try {
            Bruch bruch = new Bruch();
            bruch.setZaehler(3);
            bruch.setNenner(0);
            System.out.println(bruch.toDouble());
        } catch (VerbotenerNennerException e) {
            System.out.println(e.getMessage());
        }
    }
}
