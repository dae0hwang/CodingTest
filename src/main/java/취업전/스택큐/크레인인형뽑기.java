package 취업전.스택큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        //이것을 리스트로 고고
        List<Stack<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new Stack<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    list.get(i + 1).push(board[j][i]);
                }
            }
        }

        int answer = 0;
        int k = sc.nextInt();
        int[] go = new int[k];
        for (int i = 0; i < k; i++) {
            go[i] = sc.nextInt();
        }

        Stack<Integer> resultStack = new Stack<>();

        for (int i : go) {
            if (list.get(i).isEmpty()) {
                continue;
            }
            Integer pop = list.get(i).pop();
            if (resultStack.isEmpty()) {
                resultStack.push(pop);
            } else {
                Integer peek = resultStack.peek();
                if (pop.equals(peek)) {
                    resultStack.pop();
                    answer++;
                } else {
                    resultStack.push(pop);
                }
            }
        }
        System.out.println(answer*2);
    }
}
