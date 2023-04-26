package 스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();

        //먼저 ()를 .으로 바꿔서 표현하자
        String str = next.replace("()", "_");
        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();
        //(를 만나면, stack에 추가하기
        //_레이저를 만나면 stack에 있는 개수만큼 answer에 플러스해주기
        //)를 만나면 stack에서 제일 위에 것 제거 후 answer +1 해주기
        int answer = 0;
        for (char aChar : chars) {
            if (aChar == '_') {
                answer += stack.size();
            } else if (aChar == '(') {
                stack.push(aChar);
            } else {
                stack.pop();
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
