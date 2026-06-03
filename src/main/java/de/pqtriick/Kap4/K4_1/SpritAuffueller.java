package de.pqtriick.Kap4.K4_1;

public class SpritAuffueller {

    public static void main(String[] args) {
        Chainsaw myChainsaw = new Chainsaw();
        System.out.println(myChainsaw.getSprit());
        try {
            Chainsaw myChainsaw2 = new Chainsaw(0.8f);
            System.out.println(myChainsaw2.getSprit());
        } catch (WrongSpritVolumeException e) {
            System.out.println(e.getMessage());
        }
    }
}
