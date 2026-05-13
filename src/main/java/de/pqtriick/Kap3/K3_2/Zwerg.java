package de.pqtriick.Kap3.K3_2;

public class Zwerg {

    private String name;
    private double groesse;
    private boolean langeBartlaenge;

    public Zwerg() {
        setName("Standardzweg");
        setGroesse(1.15);
        setLangeBartlaenge(false);
    }

    public Zwerg(String name, double groesse, int bartlaenge) {
        setName(name);
        setGroesse(groesse);
        setLangeBartlaenge(bartlaenge > 50);
    }

    public void meineAbsicht() {
        System.out.println("Ich bin " + name + " und mach jeden Elfen platt!");
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLangeBartlaenge(boolean langeBartlaenge) {
        this.langeBartlaenge = langeBartlaenge;
    }

    public double getGroesse() {
        return groesse;
    }

    public String getName() {
        return name;
    }

    public boolean isLaengeBartlaenge() {
        return langeBartlaenge;
    }
}
