package 백준하나씩;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class 히스토그램 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static Stack<Item> stk = new Stack<>();
    static long answer = 0;
    static long num;
    static class Item{
        long idx, h;
        Item(long idx, long h){
            this.idx = idx;
            this.h = h;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.valueOf(br.readLine());
        for (int i = 0; i < N; i++) {
            num = Long.valueOf(br.readLine());
            while (!stk.isEmpty() && stk.peek().h > num) {
                long getH = stk.pop().h;
                long width = i;
                if(!stk.isEmpty())
                    width -= stk.peek().idx + 1;

                answer = Math.max(answer, getH * width);

            }

        }
    }
}
