package 취업전.dfsbfs1;

public class 말단노드까지가장짧은경로 {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }
    static int answer = 0;

    public static int DFS(Node node, int L) {
        if (node.lt == null && node.rt == null) {
            return L;
        } else {
            return Math.min(DFS(node.lt, L + 1), DFS(node.rt, L + 1));
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        System.out.println(DFS(root, 0));
    }
}
