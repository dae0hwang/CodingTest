package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;

public class 넓이우선 {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }

    public static void BFS(Node node) {
        int L = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int size = queue.size();
        while (!queue.isEmpty()) {
            System.out.print(L+": ");
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                System.out.print(poll.data+" ");
                if (poll.lt != null) {
                    queue.add(poll.lt);
                }
                if (poll.rt != null) {
                    queue.add(poll.rt);
                }
            }
            System.out.println();
            size = queue.size();
            L++;
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
