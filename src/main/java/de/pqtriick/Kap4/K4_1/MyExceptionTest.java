package de.pqtriick.Kap4.K4_1;

public class MyExceptionTest {

    private static void machWas() throws MyException{
        throw new MyException("Eine Ausnahme vom Typ MyException wurde ausgelöst!");
    }

    public static void main(String[] args) {
        try {
            machWas();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
