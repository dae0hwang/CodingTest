package 취업전.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 결혼식 {

    static class Time implements Comparable<Time>{
        public int time;
        public char state;
        Time(int time, char state) {
            this.time = time;
            this.state = state;
        }
        @Override
        public int compareTo(Time ob){
            if(this.time==ob.time) return this.state-ob.state;
            else return this.time-ob.time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //시작과 종료 표시를 해서, 정렬을 한다. 위에 설명한 그림이 나올 수 있도록
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sT=sc.nextInt();
            int eT=sc.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }
        Collections.sort(arr);

        //s를 만나면 cnt+1 e를 만나면 cnt-1를 해서 cnt 중에서 가장 큰 값이 답(answer)이 된다.
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for (Time time : arr) {
            if (time.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }
}
