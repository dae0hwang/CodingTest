package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수 {

    public static void main(String[] args) {
        정수 n = new 정수();
        System.out.println(n.solution(80993720));
    }

    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        while (n != 0) {
            long least = n % 10;
            n = n / 10;
            list.add(least);
        }
        Collections.sort(list);
        Collections.reverse(list);
//        System.out.println(list);
        for (Long aLong : list) {
            answer *= 10;
            answer += aLong;
        }
//        System.out.println(answer);
        return answer;
    }

}
