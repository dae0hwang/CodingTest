package 백준스택큐;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 크게만들기 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //총 받을 개수
        int k = sc.nextInt(); //k개 지우기
        int length = n - k;
        String next = sc.next();
        Integer[] arr = new Integer[n];
        List<Integer> list = new ArrayList<>();
        for (char c : next.toCharArray()) {
            list.add(c - 48);
        }
        Integer[] integers = list.toArray(arr);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < integers.length; i++) {
            while (k > 0 && !stack.isEmpty() && stack.peek() < integers[i]) {
                stack.pop();
                k--;
            }
            stack.push(integers[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(stack.get(i));
        }
        System.out.println(sb);
    }
}



