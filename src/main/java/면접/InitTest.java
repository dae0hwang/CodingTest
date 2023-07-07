package 면접;

public class InitTest {
    int x;    // 전역 - 인스턴스 변수
    int y = x; // 인스턴스 변수

    static int c; //전역 - 클래스 변수도 가능
    static int d = c;

    void method1 (){
        int i;
    }

    public static void main(String[] args) {
        InitTest initTest = new InitTest();
        initTest.method1();

    }
}
