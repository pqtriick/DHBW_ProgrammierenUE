package de.pqtriick.Kap4.K4_5;

public class BaumKnoten<T> {

    private T linkerSohn;
    private T rechterSohn;

    public BaumKnoten(T linkerSohn, T rechterSohn) {
        this.linkerSohn = linkerSohn;
        this.rechterSohn = rechterSohn;
    }

    public T getLinkerSohn() {
        return linkerSohn;
    }

    public T getRechterSohn() {
        return rechterSohn;
    }
}
