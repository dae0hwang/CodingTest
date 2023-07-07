package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 성격 {

    public static void main(String[] args) {
        성격 a = new 성격();
        a.solution("5525", "1255");
    }

    public String solution(String X, String Y) {

        List<Integer> list = new ArrayList<>();
        int[] xArr = Arrays.stream(
                Arrays.stream(X.split("")).mapToInt(s -> Integer.valueOf(s)).toArray()).sorted()
            .toArray();
        int[] yArr = Arrays.stream(
                Arrays.stream(Y.split("")).mapToInt(s -> Integer.valueOf(s)).toArray()).sorted()
            .toArray();
//        System.out.println(Arrays.toString(xArr));
//        System.out.println(Arrays.toString(yArr));
        int xt = 0, yt = 0;
        while (xt < xArr.length && yt < yArr.length) {
            if (xArr[xt] == yArr[yt]) {
                list.add(xArr[xt]);
                xt++;
                yt++;
            } else if (xArr[xt] > yArr[yt]) {
                yt++;
            } else {
                xt++;
            }
        }
        Collections.reverse(list);
        if (list.size() == 0) {
            return "-1";
        }
        int number = 0;
        for (Integer integer : list) {
            number *= 10;
            number += integer;
        }
        return String.valueOf(number);
    }
}
