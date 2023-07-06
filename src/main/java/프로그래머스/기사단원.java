package 프로그래머스;

public class 기사단원 {
    public static void main(String[] args) {


    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] num = new int[number];

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count++;
                } else if (i * j == 0) {
                    count += 2;
                }
            }
            num[i - 1] = count;

        }


        return answer;
    }
}
