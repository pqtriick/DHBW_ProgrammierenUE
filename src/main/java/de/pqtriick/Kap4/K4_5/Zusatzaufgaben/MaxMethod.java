package de.pqtriick.Kap4.K4_5.Zusatzaufgaben;

/*
Codieren Sie eine generische Klassenmethode max(…), die das größere von zwei übergebenen Objekten zurückgibt.
Die Objekte müssen Subtyp des Interfaces java.lang.Comparable<T> sein.
 */
public class MaxMethod {

    public static <T extends Comparable<T>> T max(T obj1, T obj2) {
        return obj1.compareTo(obj2) >= 0 ? obj1 : obj2;
    }

    public static void main(String args[]) {
        Integer i = MaxMethod.max(0, 5);
        String s = MaxMethod.max("Apfel", "Birne");
        System.out.println(i);
        System.out.println(s);
    }
}
