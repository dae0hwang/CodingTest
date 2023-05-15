package 백준스택큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 문자열폭발 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a = br.readLine();
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= a.length()) {
                boolean isSame = true;
                for (int j = 0; j < a.length(); j++) {
                    if (stack.get(stack.size() - a.length() + j) != a.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    for (int j = 0; j < a.length(); j++)
                        stack.pop();
                }
            }
        }

        for (char ch : stack)
            sb.append(ch);

        System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
    }
}
