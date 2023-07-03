package 취업전.투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();
        //먼저 주어진 배열을 오름 차순으로 정렬한다.
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            //a 기준으로 b의 값이 같으면,
            //값을 추가한다음 a,b와 인덱스 동시에 올려준다
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
                //b의 값이 크다면 a 인덱스만 올려준다.
            } else if (a[p1] < b[p2]) {
                p1++;
                //a의 값이 크다면 b 인덱스만 올려준다.
            } else {
                p2++;
            }
        }
        System.out.println(answer);
    }
}
