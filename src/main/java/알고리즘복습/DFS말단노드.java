package 알고리즘복습;

class Node2 {
    int root;
    Node2 lt;
    Node2 rt;

    public Node2(int root, Node2 lt, Node2 rt) {
        this.root = root;
        this.lt = lt;
        this.rt = rt;
    }
}
public class DFS말단노드 {

    static int min = Integer.MAX_VALUE;

    public static void DFS(Node2 node, int v) {
        if (node.lt == null && node.rt == null) {
            min = Math.min(min, v);
        } else {
            DFS(node.lt, v + 1);
            DFS(node.rt, v + 1);
        }
    }
    public static void main(String[] args) {
        Node2 root = new Node2(1, new Node2(2, new Node2(4, null, null), new Node2(5, null, null)),
            new Node2(3, null, null));
        DFS(root, 0);
        System.out.println(min);
    }

}
