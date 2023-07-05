package 면접;

public class InitTest {
    int x;    // 인스턴스 변수
    int y = x; // 인스턴스 변수

    void method1 (){
        int i;
        System.out.println("aa");
    }

    public static void main(String[] args) {
        InitTest initTest = new InitTest();
        initTest.method1();

    }
}
