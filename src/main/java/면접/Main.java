package 면접;

public class Main {

    public static void main(String[] args) {
        AA a = new AA() {
            @Override
            public void a2() {
                super.a2();
            }

            @Override
            public void a3() {
                super.a3();
            }
        };

    }
}
