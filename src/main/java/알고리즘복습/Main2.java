package 알고리즘복습;

class Node {

    int root;
    Node2 lt;
    Node2 rt;

    public Node(int root, Node2 lt, Node2 rt) {
        this.root = root;
        this.lt = lt;
        this.rt = rt;
    }
}

public class Main2 {

    public static void DFS(Node2 node) {
        if (node == null) {
            return;
        } else {
            DFS(node.lt);
            DFS(node.rt);
            System.out.print(node.root+" ");
        }
    }
    public static void main(String[] args) {
        Node2 root = new Node2(1, new Node2(2, new Node2(4, null, null), new Node2(5, null, null)),
            new Node2(3, new Node2(6, null, null), new Node2(7, null, null)));
        DFS(root);
    }
}
