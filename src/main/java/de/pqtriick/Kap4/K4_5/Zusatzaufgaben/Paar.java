package de.pqtriick.Kap4.K4_5.Zusatzaufgaben;

/*
Codieren Sie eine generische Klasse Paar<T>, die zwei Werte desselben Typs speichert (2 Objektattribute).
Beachten Sie das Kapselungs-Prinzip und ermöglichen Sie lesenden Zugriff von außen.
Codieren Sie auch einen Konstruktor zum initialisieren der beiden Attribute.
 */

public class Paar<T> {

    private T wert1;
    private T wert2;

    public Paar(T wert1, T wert2) {
        this.wert1 = wert1;
        this.wert2 = wert2;
    }

    public T getWert1() {
        return wert1;
    }

    public T getWert2() {
        return wert2;
    }
}
