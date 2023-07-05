package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 문자열압축하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "KKHSSSSSSSE";
        Queue<Character> q = new LinkedList<>();
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char aChar : chars) {
            if (!q.isEmpty()) {
                if (q.peek() == aChar) {
                    q.add(aChar);
                } else {
                    int size = q.size();
                    Character peek = q.peek();
                    if (size == 1) {
                        stringBuilder.append(peek);
                    } else {
                        stringBuilder.append(peek).append(size);
                    }
                    q.clear();
                    q.add(aChar);
                }
            } else {
                q.add(aChar);
            }
        }

        //마지막 것 꺼내주기
        int size = q.size();
        Character peek = q.peek();
        if (size == 1) {
            stringBuilder.append(peek);
        } else {
            stringBuilder.append(peek).append(size);
        }
        System.out.println(stringBuilder.toString());
    }
}
