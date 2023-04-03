package DFS2;

import java.util.Arrays;
import java.util.Scanner;

public class 순열구하기 {
    static int[] pm, ch, arr;
    static int n, m;

    public static void DFS(int L) {
        if (L == m) {
            System.out.println(Arrays.toString(ch));
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();

        //레벨 별 값을 넣을 것이기 때문에 레벨과 같은 2 로 설정한다.
        pm = new int[m];
        //중복을 허용하지 않게, arr[3,6,9] 인덱스 번호로, pm에 해당 값이 있는 지 체크할 수 있는 배열을 만들어준다
        //그래서 숫자를 담아놓은 arr배열과 같은 3으로 설정한다.
        ch = new int[n];
        DFS(0);
    }
}
