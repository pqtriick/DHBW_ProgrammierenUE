package de.pqtriick.Kap4.K4_1;

public class Chainsaw {

    private float sprit;

    public Chainsaw() {

    }

    public Chainsaw(float sprit) {
        setSprit(sprit);
    }

    public float getSprit() {
        return this.sprit;
    }

    public void setSprit(float sprit) {
        if (0.0 < sprit && sprit < 0.5) {
            this.sprit = sprit;
        } else {
            throw new WrongSpritVolumeException();
        }
    }
}
