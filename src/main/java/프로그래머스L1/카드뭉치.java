package 프로그래머스L1;

import java.util.LinkedList;
import java.util.Queue;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for (String s : cards1) {
            queue1.add(s);
        }
        for (String s : cards2) {
            queue2.add(s);
        }
        boolean flag = true;
        for (String s : goal) {
            String p1 = queue1.peek();
            String p2 = queue2.peek();
            if (s.equals(p1)) {
                queue1.poll();
            } else if (s.equals(p2)) {
                queue2.poll();
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        if (flag) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for (String s : cards1) {
            queue1.add(s);
        }
        for (String s : cards2) {
            queue2.add(s);
        }
        boolean flag = true;
        for (String s : goal) {
            System.out.println("s = " + s);
            String p1 = queue1.peek();
            String p2 = queue2.peek();
            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);
            if (s.equals(p1)) {
                queue1.poll();
            } else if (s.equals(p2)) {
                queue2.poll();
            } else {
                System.out.println("check");
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
