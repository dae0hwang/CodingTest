package 취업전.복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o){
        return o.h-this.h;
    }
}
public class 씨름선수 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h=kb.nextInt();
            int w=kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(solution(arr, n));
    }

    public static int solution(List<Body> arr, int n) {
        Collections.sort(arr);
        //키가 큰 순서대로 정렬을 먼저 했다.
        Integer max = Integer.MIN_VALUE;
        //앞에부터 탐색하면서 몸무게만 자신 앞 사람보다 많이 나가기만 하면된다.
        int cnt = 0;
        for (Body body : arr) {
            if (body.w > max) {
                cnt++;
                max = body.w;
            }
        }
        return cnt;
    }

}
