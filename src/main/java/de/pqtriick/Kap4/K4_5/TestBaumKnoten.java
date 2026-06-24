package de.pqtriick.Kap4.K4_5;

public class TestBaumKnoten {

    public static void main(String[] args) {
        BaumKnoten<String> bk1 = new BaumKnoten<String>("LinkerSohn", "RechterSohn");
        String l1 = bk1.getLinkerSohn();
        String r1 = bk1.getRechterSohn();

        BaumKnoten<Double> bk2 = new BaumKnoten<Double>(25.5, 50.0);
        Double l2 = bk2.getLinkerSohn();
        Double r2 = bk2.getRechterSohn();
    }
}
