package 면접;

public class Test {

    public static void main(String[] args) {
        String s = new String("aa");
        System.out.println(System.identityHashCode(s));
        s += "cc";
        System.out.println(System.identityHashCode(s));
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        sb.append("aa");
        System.out.println(System.identityHashCode(sb));
        sb.append("cc");
        System.out.println(System.identityHashCode(sb));

        String dd = "ss";
        System.out.println(System.identityHashCode(dd));
        dd += "dd";
        System.out.println(System.identityHashCode(dd));
        int cc = 3;
        System.out.println(System.identityHashCode(cc));
        int sdf = 3;
        System.out.println(System.identityHashCode(sdf));




    }
}
