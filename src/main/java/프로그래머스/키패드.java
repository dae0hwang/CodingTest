package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 키패드 {
    public static void main(String[] args) {
        키패드 a = new 키패드();
        String right = a.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        System.out.println(right);
    }
    static Map<Integer, Integer[]> map;
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        map = new HashMap<>();
        map.put(1, new Integer[]{0, 0}); //10 11로 변경
        map.put(2, new Integer[]{0, 1}); //10 11로 변경
        map.put(3, new Integer[]{0, 2}); //10 11로 변경
        map.put(4, new Integer[]{1, 0}); //10 11로 변경
        map.put(5, new Integer[]{1, 1}); //10 11로 변경
        map.put(6, new Integer[]{1, 2}); //10 11로 변경
        map.put(7, new Integer[]{2, 0}); //10 11로 변경
        map.put(8, new Integer[]{2, 1}); //10 11로 변경
        map.put(9, new Integer[]{2, 2}); //10 11로 변경
        map.put(10, new Integer[]{3, 0}); //10 11로 변경
        map.put(0, new Integer[]{3, 1}); //10 11로 변경
        map.put(11, new Integer[]{3, 2}); //10 11로 변경

        int rightNow = 10;
        int leftNow = 11;

        for (int number : numbers) {
            System.out.println("number " + number);
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftNow = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightNow = number;
            } else {
                int leftDis = distant(leftNow, number);
//                System.out.println("leftDis = " + leftDis);;
                int rightDis = distant(rightNow, number);
//                System.out.println("rightDis = " + rightDis);
                if (leftDis > rightDis) {
                    sb.append("R");
                    rightNow = number;
                } else if (leftDis < rightDis) {
                    sb.append("L");
                    leftNow = number;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rightNow = number;
                    } else {
                        sb.append("L");
                        leftNow = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int distant(int a, int b) {
        Integer[] aa = map.get(a);
        Integer[] bb = map.get(b);
//        System.out.println("Arrays.toString(aa) = " + Arrays.toString(aa));
//        System.out.println("Arrays.toString(bb) = " + Arrays.toString(bb));
        int dis = Math.abs(aa[0] - bb[0]) + Math.abs(aa[1] - bb[1]);
        return dis;
    }



    //둘 사이 거리 찾아내는 게 일이네함수해서 하면된다.
}
