package de.pqtriick.Kap4.K4_5.Zusatzaufgaben;

public class SwapMethod<A> {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        swap(arr, 0, 2);
        for (String temp : arr) {
            System.out.println(temp);
        }
    }

    public static <A> void swap(A[] array, int first, int second) {
        A value = array[first];
        array[first] = array[second];
        array[second] = value;
    }

}

