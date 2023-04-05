package DFS2;
import java.util.*;
public class 수열추측하기{
    static int[] b, p, ch;
    static int n, f;
    boolean flag=false;
    int[][] dy=new int[35][35];

    //nc0 이런거 구해서 b배열에 널기
    public int combi(int n, int r){
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public void DFS(int L, int sum){
        if (flag) {
            return;
        }
        if (L == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                    flag = true;
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                //1234
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] + b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    //이것은 그냥 1~4 까지 4자리 숫자 구하기.
    public void DFS2(int L) {
        if (L == n) {
            for (int x : p) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS2(L + 1);
                    ch[i] = 0;
                }
            }
        }

    }

//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        n=kb.nextInt(); //1부터 n까지
//        f=kb.nextInt(); //목표 숫자
//        b=new int[n];  //콤비네이션 숫자 4c0 이런것
//        p=new int[n];  //1234 1324 같은 것. 들어갈 배열
//        ch=new int[n+1];  //중복 되면 안되니깐 체크
//        for(int i=0; i<n; i++){
//            b[i]=T.combi(n-1, i);
//        }
//        T.DFS(0, 0);
////        T.DFS2(0);
////        System.out.println("Arrays.toString(p) = " + Arrays.toString(p));
//    }
}