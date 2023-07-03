package 취업전.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //답이 될 수 있는 가장 작은 수 1
        int lt = 1;
        //답이 될 수 있는 가장 큰 수 가장 큰수
        int rt = arr[n - 1];

        //이제 lt와 rt 사이 값중 조건을 만족하고
        //가장 큰 수를 구하면 된다.
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            //이 중간 값이 몇 마리의 말 수용 가능한지 체크하기.
            int check = count(arr, mid);
            //수용 가능한 말이 조건의 수보다 크면( 간격을 더 늘려도 된다)
            if (check >= m) {
                answer = mid;
                //더 가능한 큰 수 있는 지 중간 오른쪽으로 이동
                lt = mid + 1;
            } else {
                //없다면 가능한 더 작은 수 있는 왼쪽 이동
                rt = mid - 1;
            }
        }
        System.out.println(answer);
    }

    //해당 간격으로 m마리 말 넣을 수 있는 지 확인하기.
    public static int count(int[] arr, int dist){
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
}
