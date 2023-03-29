package dfsbfs1;

public class 재귀이진트리순회 {
    static class Node {

        int root;
        Node lt;
        Node rt;

        public Node(int root) {
            this.root = root;
            lt = null;
            rt = null;
        }

        public Node(int root, Node lt, Node rt) {
            this.root = root;
            this.lt = lt;
            this.rt = rt;
        }

    }
    public static void DFS(Node node) {

        if (node ==null) {
        } else {
            System.out.print(node.root+" ");
            DFS(node.lt);
            DFS(node.rt);
        }
    }
    public static void main(String[] args) {
        Node four = new Node(4);
        Node five = new Node(5);
        Node two = new Node(2, four, five);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node three = new Node(3, six, seven);
        Node one = new Node(1, two, three);
        DFS(one);
    }
}
