package 취업전.dfsbfs1;

import java.util.Scanner;

public class 부분집합구하기 {

    static int[] ch;
    static int n;

    public static void DFS(int l) {
        if (l == n + 1) {
            String str = "";
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == 1) {
                    str += i;
                }
            }
            System.out.println(str);
        } else {
            ch[l] = 1;
            DFS(l + 1);
            ch[l] = 0;
            DFS(l + 1);
        }
    }
    public static void main(String[] args){
        n = 3;
        ch = new int[n + 1];
        DFS(1);
    }
}
