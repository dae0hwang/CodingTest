package 취업전.해시셋;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class 매출액의종류 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        //먼저 k번 전 까지 hashmap에 담아놓기
        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt=k-1; rt<n; rt++){
            //한칸 전진 했으니, 해시 맵의 키 개수를 answer에 넣어 준다.
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            //lt를 앞으로 한칸 전진
            HM.put(arr[lt], HM.get(arr[lt])-1);
            //값이 0이되면 삭제하기 맵 사이즈에 포함되지 않게.
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        System.out.println(answer);
    }
}
