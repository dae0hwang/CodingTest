package 프로그래머스;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {

    public int solution(int[] nums) {


        int answer = 0;
        return answer;
    }

}
class asdfasd {

//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(new int[]{3,3,3,2,2,4}));
//    }

    static int n, m, answer;
    static int[] dis;
    static Set<Integer> set = new HashSet<>();
    static int[] check;
    public int solution(int[] nums) {
        n = nums.length;
        m = n / 2;
        check = new int[n];
        dis = new int[m];
        answer = 0;
        asdfasd.DFS(0, nums);
        return answer;
    }

    public static void DFS(int V, int[] nums) {
        if (V == m) {
//            Set<Integer> set = new HashSet<>();
//            for (int di : dis) {
//                set.add(di);
//            }
            answer = Math.max(answer, set.size());
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
//                    dis[V] = nums[i];
                    set.add(nums[i]);
                    DFS(V + 1, nums);
                    check[i] = 0;
                }
            }
        }
    }
}
