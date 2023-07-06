package 프로그래머스;

public class 정수의제곱 {

    public static void main(String[] args) {
        정수의제곱 a = new 정수의제곱();
        long solution = a.solution(3);
        System.out.println(solution);
    }

    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return Math.floor(sqrt) == sqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
