package 취업전.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lt = 0;
        int rt = arr.length-1;
        int answer = 0;

        //이분 검색을 위한 많이 사용하는 코드 형싱이다.
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            //mid 인덱스 값이 찾고자 하는 값보다 크면 왼쪽으로 이동
            if(arr[mid]>m) rt=mid-1;
            //찾고자 하는 값보다 작으면 오른쪽으로 mid 이동한다.
            else lt=mid+1;
        }
        System.out.println(answer);
    }
}
