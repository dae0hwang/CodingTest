package 취업전.복습;

public class 재귀함수2 {
    public static void DFS(int n) {
        if (n == 1) {
            System.out.print(n+" ");
        } else {
            int nextInt = n % 2;
            DFS(n/2 );                //6번 라인
            System.out.print(nextInt + " "); //7번 라인
        }
    }
    public static void main(String[] args){
        DFS(11);
    }
}
