package de.pqtriick.Kap4.K4_1;

public class Bruch {

    private double zaehler;
    private double nenner;

    public void setZaehler(double zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(double nenner) throws VerbotenerNennerException{
        if (nenner != 0) {
            this.nenner = nenner;
        } else {
            throw new VerbotenerNennerException();
        }
    }
    public double toDouble() throws VerbotenerNennerException {
        if (this.nenner != 0) {
            return zaehler / nenner;
        } else {
            throw new VerbotenerNennerException();
        }
    }
}