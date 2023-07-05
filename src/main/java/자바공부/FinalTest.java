package 자바공부;

import java.util.Vector;

public class FinalTest {

    public static class BB {

        public static void finalArgument(final int a) {
            System.out.println(a);
        }
    }

    public static void A() {
        System.out.println("aa");
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(54);
        vector.add(2);
        System.out.println(vector);
    }

}
