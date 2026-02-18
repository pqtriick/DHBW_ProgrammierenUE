package de.pqtriick.Kap2.K2_9;

import java.util.Scanner;

public class SinglyLinkedList3 {

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

        static void addLast(int elem) {
            if (isEmpty()) {
                addFirst(elem);
                return;
            }
            Node current = head;
            if (current.next == null) {
                current.next = new Node(elem, null);
                size++;
                return;
            }
            while (true) {
                current = current.next;
                if (current.next == null) {
                    current.next = new Node(elem, null);
                    size++;
                    break;
                }
            }
        }

        static boolean searchElem(int e) {
            Node current = head;
            if (isEmpty()) return false;
            while (current != null) {
                if (current.elem == e) return true;
                current = current.next;
            }
            return false;
        }

        static void printListRek(Node ref) {
            if (isEmpty()) return;
            if (ref == null) return;
            System.out.println(ref.elem);
            printListRek(ref.next);
        }

        static void buildList() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gebe Zahlen ein die du zur liste hinzufügen willst (0 = abbruch):");
            int x = scanner.nextInt();
            while (x != 0) {
                addLast(x);
                x = scanner.nextInt();
            }
            scanner.close();
        }



        // Hauptprogramm
        public static void main(String[] args) {
            buildList();
            printList();
        }
    }
}
