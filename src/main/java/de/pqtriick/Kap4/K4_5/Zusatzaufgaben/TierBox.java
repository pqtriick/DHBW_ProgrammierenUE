package de.pqtriick.Kap4.K4_5.Zusatzaufgaben;

/*
Erstellen Sie eine Klasse TierBox<T extends Tier>. Diese verwaltet ein Tier vom Typ T und besitzt einen entsprechenden
Konstruktor zum Initialisieren des Attributs. Kapselung soll beachtet werden und nur lesender Zugriff von außen
gewährt werden. Sie kann auch auf die Nachricht printName() reagieren, indem sie die Interface-Methode getName()
einsetzt
 */
public class TierBox <T extends Tier> {

    private T tier;

    public TierBox(T tier) {
        this.tier = tier;
    }

    public void printName() {
        System.out.println(tier.getName());
    }

    public T getTier() {
        return tier;
    }
}
