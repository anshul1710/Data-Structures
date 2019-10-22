package trees;

import java.util.Scanner;


public class RunTree {
    public static void main(String[] args)
    {
    BinaryTree bt=new BinaryTree();
        Scanner sc=new Scanner(System.in);
       //TreeNode tr= bt.takeInput(sc);
      TreeNode tr=  bt.getInputLevelWise(sc);
      bt.printLevelWise(tr);
        System.out.println(bt.diameter(tr));
        /*bt.print(tr);
        System.out.println(bt.countNodes(tr));
        System.out.println(bt.checkNode(tr,4));
        System.out.println(bt.height(tr));
        bt.printNodesWithoutSibling(tr);*/


    }
}
