package de.pqtriick.Kap2.K2_8;

import java.util.Random;

public class PokerTrainer {

    static Cards hand1, hand2;

    static enum Cards {
        HIGHEST_CARD, PAIR, TWOPAIR, TRIPLE, STREET, FLUSH, FULLHOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH, ROYALFLUSH
    }

    public static void main(String[] args) {
        System.out.println("Das spielt beginnt...");
        for (int i = 0; i < 15; i++) {
            hand1 = randomCards();
            hand2 = randomCards();
            wins(hand1, hand2);
        }
    }

    private static Cards randomCards() {
        Cards[] cards = Cards.values();
        Random random = new Random();
        int index = random.nextInt(cards.length);
        return cards[index];
    }

    private static void wins(Cards card1, Cards card2) {
        if (card1.ordinal() > card2.ordinal()) {
            System.out.println(card1.toString() + " schlägt " + card2.toString());
        } else {
            System.out.println(card2.toString() + " schlägt " + card1.toString());
        }
    }

}
