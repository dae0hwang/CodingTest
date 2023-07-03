package 취업전.DFS2;
import java.util.*;
public class 수열추측하기{

    static int n, m;
    static int[] comb, p, ch;
    static boolean flag = false;

    //부분집합 위치마다 곱해지는 조합의 수 구하는 메소드
    public static int combi(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return combi(n - 1, r) + combi(n - 1, r - 1);
        }
    }

    public static void DFS(int L, int sum) {
        if (flag) {
            return;
        }
        if (L == n) {
            if (sum == m) {
                for(int x : p) System.out.print(x+" ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    //부분 집합 위치별 조합의 수와 해당 부분집합 위치의 값을 곱해서 sum에 넣어준다.
                    DFS(L + 1, sum + p[L] * comb[L]);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        //m은 목표하는 값
        m = sc.nextInt();

        comb = new int[n];
        for (int i = 0; i < comb.length; i++) {
            //3c0 ~ 3c3까지 해당 값 배열에 넣기
            comb[i] = combi(n-1, i);
        }

        //DFS Level 별로 값을 담을 p 배열
        p = new int[n];
        //중복되지 않는 부분집합을 구하기 위해
        ch=new int[n+1];
        DFS(0, 0);
    }
}