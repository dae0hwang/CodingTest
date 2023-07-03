package 취업전.복습;

import java.util.Scanner;

public class 히스토그램 {
    static class node {
        int height;
        int num;

        public node(int height, int num) {
            this.height = height;
            this.num = num;
        }

        @Override
        public String toString() {
            return "node{" +
                "height=" + height +
                ", num=" + num +
                '}';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 1;

        node max = new node(0, 0);

        for (int i = 0; i < n; i++) {
            int next = sc.nextInt();
            //받아온 수
            node newNode = new node(next, 1);

            //new node의 값 height*1
            //더한 값 next 하고 max 하고 작은수 *
            int cal = Math.min((max.height), newNode.height);
            int plusNum = cal * (max.num + 1);
            System.out.println("plusNum = " + plusNum);
            int newNum = newNode.height;
            System.out.println("newNum = " + newNum);
            if (newNum >= plusNum) {
                max = newNode;
            } else {
                max = new node(cal, max.num + 1);
            }
            System.out.println("new max = " + max);
        }




    }

}