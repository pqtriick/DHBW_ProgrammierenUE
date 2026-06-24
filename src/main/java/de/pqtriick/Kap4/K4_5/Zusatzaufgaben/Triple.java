package de.pqtriick.Kap4.K4_5.Zusatzaufgaben;

/*
Codieren Sie eine generische Klasse Triple<A, B, C>, die drei Werte unterschiedlicher Typen speichert (3 Objektattribute).
Beachten Sie das Kapselungs-Prinzip und ermöglichen Sie lesenden Zugriff von außen.
Codieren Sie auch einen Konstruktor zum initialisieren der drei Attribute.
 */
public class Triple<A, B, C> {

    private A typ1;
    private B typ2;
    private C typ3;

    public Triple(A typ1, B typ2, C typ3) {
        this.typ1 = typ1;
        this.typ2 = typ2;
        this.typ3 = typ3;
    }

    public A getTyp1() {
        return typ1;
    }

    public B getTyp2() {
        return typ2;
    }

    public C getTyp3() {
        return typ3;
    }
}
