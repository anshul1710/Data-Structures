package trees;

import Queue.NodeQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    public static TreeNode takeInput(Scanner sc) {
        int rootData;
        System.out.println("Enter root's data");
        rootData = sc.nextInt();
        if (rootData == -1)
            return null;

        TreeNode root = new TreeNode();
        root.data = rootData;
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    public static void print(TreeNode root) {
        if (root == null)
            return;

        String toBePrinted = root.data + ": ";
        if (root.left != null)
            toBePrinted += "L: " + root.left.data + ",";

        if (root.right != null)
            toBePrinted += "R: " + root.right.data + ",";

        System.out.println(toBePrinted);

        print(root.left);
        print(root.right);

    }

    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int ans = 1;
        ans += countNodes(root.left);
        ans += countNodes(root.right);
        return ans;

    }

    public static boolean checkNode(TreeNode root, int x) {
        if (root == null)
            return false;

        if (root.data == x)
            return true;

        boolean ans = checkNode(root.left, x);
        boolean ans1 = checkNode(root.right, x);
        return ans || ans1;
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l, r) + 1;
    }
    public static int diameter(TreeNode root)
    {
        if(root==null)
            return 0;

        int option1=height(root.left)+height(root.right);
        int option2=diameter(root.left);
        int option3= diameter(root.right);

        return Math.max(option2,Math.max(option3,option1));
    }
    public static void printNodesWithoutSibling(TreeNode root) {

        if (root == null)
            return;
        if (root.left == null && root.right != null)
            System.out.println(root.right.data);
        if (root.right == null && root.left != null)
            System.out.println(root.left.data);

        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    public static TreeNode getInputLevelWise(Scanner s)
    {
        Scanner sc = new Scanner(System.in);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        System.out.println("enter root");
        int rootData = sc.nextInt();
        if (rootData == -1)
            return null;
        TreeNode root = new TreeNode();
        root.data = rootData;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode front = queue.remove();
            System.out.println("enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                TreeNode child = new TreeNode();
                child.data = leftChild;
                queue.add(child);
                front.left = child;
            }

            System.out.println("enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                TreeNode child = new TreeNode();
                child.data = rightChild;
                queue.add(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode root) {
        Scanner sc = new Scanner(System.in);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            while (n > 0)
            {
                TreeNode front = queue.remove();
                System.out.println("root is  " + front.data);
                if(front.left!=null)
                {
                    queue.add(front.left);
                    System.out.println("left is "+front.left.data );
                }
                else
                {
                    System.out.println("left is "+ -1);
                }
                if(front.right!=null)
                {
                    queue.add(front.right);
                    System.out.println("right is "+front.right.data );
                }
                else
                {
                    System.out.println("right is "+ -1);
                }
            n--;
            }
        }
    }
}
