package 취업전.복습하기;

public class DFS {
    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);                //6번 라인
            System.out.print(n + " "); //7번 라인
        }
    }
    public static void main(String[] args){
        DFS(7);
    }

}
