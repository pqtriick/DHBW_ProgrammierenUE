package de.pqtriick.Kap4.K4_1;

public class VerbotenerNennerException extends RuntimeException {

    public VerbotenerNennerException() {
        super("Der Nenner darf nicht 0 sein!");
    }
}
