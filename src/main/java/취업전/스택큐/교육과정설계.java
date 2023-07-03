package 취업전.스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String t = sc.next();

        Queue<Character> queue = new LinkedList<>();
        for (char c : n.toCharArray()) {
            queue.add(c);
        }

        String answer = "YES";
        for (char x : t.toCharArray()) {
            if (queue.contains(x)) {
                //듣는 과목이 큐 안에 있다면
                // 가장 큐의 맨 앞 과목이어야 한다.
                if (x != queue.poll()) {
                    answer = "NO";
                    break;
                }
            }
        }
        //큐가 비어져 있지 않다. 필수 과목을 듣지 않았다
        //그러면 NO 출력
        if (!queue.isEmpty()) {
            answer = "NO";
        }
        System.out.println(answer);
    }
}
