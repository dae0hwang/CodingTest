package 자바공부;

import java.util.HashMap;
import java.util.Set;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Equal {

    public String a;
    public int b;

    public Equal(String a, int b) {
        this.a = a;
        this.b = b;
    }
}

class ss {
    public static void main(String[] args) {
//        Equal equal1 = new Equal("a", 1);
//        Equal equal2 = new Equal("b", 2);
//        int i1 = equal1.hashCode();
//        int i2 = equal2.hashCode();
//        System.out.println(i1);
//        System.out.println(i2);
        Integer integer1 = 3;
        Integer integer2 = 4;
        System.out.println(integer1.hashCode());
        System.out.println(integer2.hashCode());
        Character str = 'a';
        System.out.println(str.hashCode());
        Boolean bo = false;
        System.out.println(bo.hashCode());
        System.out.println(bo.hashCode());

        boolean equals = integer1.equals(integer2);
        System.out.println(equals);
        throw new RuntimeException();
    }

}