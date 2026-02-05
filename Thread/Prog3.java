import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int no) {
        data = no;
        left = right = null;

    }

}

public class Prog3 {
    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(10);
        root.left.left = new Node(5);
        root.right = new Node(18);
        root.right.right = new Node(35);
        root.right.left = new Node(28);

        levelwiseDisplay(root);

    }

    static void levelwiseDisplay(Node temp) {
        int level = 0;
        // Queue<Node> q=new Queue<Node>(); error bcoz queue is interface & cannot
        // instantiate
        Queue<Node> q = new LinkedList<Node>();// LL is collection to work on FIFO principle
        Node dummy = null;
        q.add(temp); // add root to queue
        q.add(dummy);
        System.out.print("Level0"+" ");

        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp == dummy && q.isEmpty()) {
                break;
            }
            if (temp == dummy) {
                q.add(dummy);
                level++;
                System.out.print("\nLevel" + level + " ");
            }
            if (temp != dummy) {
                System.out.print(temp.data+ " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                
            }

        }

    }

}

/* two types of method:i>instance- for object ii>static */