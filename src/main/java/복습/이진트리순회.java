package 복습;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리순회 {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }

    public static void BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int L = queue.size();
            for (int i = 0; i < L; i++) {
                Node current = queue.poll();
                System.out.print(current.data);
                if (current.lt != null) {
                    queue.add(current.lt);
                }
                if (current.rt != null) {
                    queue.add(current.rt);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        BFS(root);
    }


}
