//Given Binary Tree with int values and  a target value.Write a method which will check
// the sum of all values of  node from root to leaf node on a path anf if matches the target return true otherwise false

import java.util.Stack;
class Prog2 {
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(8);
        root.left.left=new Node(7);
        root.right=new Node(2);
        root.right.right=new Node(1);
        root.right.left=new Node(7);
        int target=14;

        System.out.println(checkSumPath(root,target));

        
    }
    static boolean checkSumPath(Node temp,int target);
    {
            Stack<Node> stk_adr=new Stack<Node>();
            Stack<Integer> stk_val=new Stack<>();

            //check whether we have reached the leaf node and sum matches the target
            
            int sum=temp.data;
            stk_adr.push(temp);
            stk_val.push(sum); //temp data
            while (!stk_adr.isEmpty()) {
            if(temp== null && temp.right ==null && sum==target)
            {
                return true;
            }
            if(temp.left!==null)
            {
                //push the code alongwith sum of it's predecessor nodes in stack
                stk_adr.push(temp.left);
                stk_val.push(temp.left.data+sum);

            }
           if(temp.right!==null)
            {
                //push the code alongwith sum of it's predecessor nodes in stack
                stk_adr.push(temp.right);
                stk_val.push(temp.right.data+sum);

            }
        }
        return false;

    }

        
}
class Node {
    int data;
    Node left,right;

    Node(int no){
        data=no;
        left=right=null;
    }

    
}
