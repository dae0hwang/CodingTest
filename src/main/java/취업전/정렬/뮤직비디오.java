package 취업전.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        int solution = solution(n, m, arr);
        System.out.println(solution);
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        //arr에서 가장 큰 값을 구한다. = lt
        int lt= Arrays.stream(arr).max().getAsInt();
        //arr의 총합을 구한다. = rt
        //이 둘 사이에서 조건을 만족하는3개로 나누어지는 가장 작은 값 구해야 한다.
        int rt=Arrays.stream(arr).sum();

        while (lt <= rt) {
            //27부터 시작 - DVD 한장 용량 - 이 용량에 3개로 나누어서 담을 수 있나?
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                //이 용량으로는 가능한거구나
                answer = mid;
                rt = mid - 1;
            } else {
                //이 용량으로는 안된다
                //이 용량으로는 부족해 3장으로 담아지지가 않아
                //더 큰 용량이 필요하다.
                lt = mid + 1;
            }

        }
        return answer;
    }

    //몇 장 나오는 지 확인 해당 DVD 용량으로 2장으로 할 수 있다면, 27 이후에 숫자 볼 필요 없다.
    public static int count(int[] arr, int capacity) {
        //DVD 장수
        int cnt = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}
