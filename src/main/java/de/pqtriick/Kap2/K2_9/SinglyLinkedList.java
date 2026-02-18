package de.pqtriick.Kap2.K2_9;

public class SinglyLinkedList {

    // Globale Variablen
    static Node head = null;
    static int size = 0;

    // Innere Klasse
    static class Node {
        int elem;
        Node next;

        // Konstruktor
        Node(int elem, Node next) {
            this.elem = elem;
            this.next = next;
        }


        /**
         * Methode zur Ausgabe der List-Elemente Kann hier keine erweiterte for-Schleife
         * einsetzen, da weder Array noch Subtyp von Collection oder Iterable
         */
        static void printList() {
            Node current = head;
            if (isEmpty()) return;
            while (current != null) {
                System.out.println(current.elem);
                current = current.next;
            }
        }

        /**
         * Operation: Test auf leere Liste
         *
         * @return true, falls Liste leer
         */
        static boolean isEmpty() {
            return head == null || size == 0;
        }

        /**
         * Operation: vorne Einfügen
         */
        static void addFirst(int e) {
            Node newNode = new Node(e, head);
            head = newNode;
            size++;
        }


        // Hauptprogramm
        public static void main(String[] args) {
            addFirst(21);
            addFirst(456);
            addFirst(2);
            addFirst(12);
            addFirst(56);
            addFirst(23);
            addFirst(8);
            addFirst(5);
            printList();
        }
    }
}
