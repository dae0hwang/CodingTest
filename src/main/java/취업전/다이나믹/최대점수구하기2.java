package 취업전.다이나믹;

import java.util.Arrays;
import java.util.Scanner;

public class 최대점수구하기2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] dy=new int[m+1];
        for(int i=0; i<n; i++){
            int ps=kb.nextInt();
            int pt=kb.nextInt();
            for(int j=m; j>=pt; j--){
                dy[j]=Math.max(dy[j], dy[j-pt]+ps);
            }
        }
        System.out.println(Arrays.toString(dy));
        System.out.print(dy[m]);
    }
}
