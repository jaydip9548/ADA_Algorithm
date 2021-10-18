package Tree;

import java.util.Scanner;

public class L1_BST {

    class BstNode {

        int data;
        BstNode left;
        BstNode right;

        public BstNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static BstNode root = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        L1_BST l1 = new L1_BST();

        root = l1.Insert(root, 15);
        System.out.println(root);
        l1.Insert(root, 10);
        l1.Insert(root, 20);
        l1.Insert(root, 25);
        l1.Insert(root, 8);
        l1.Insert(root, 12);

        System.out.println("Enter number you want to search  : ");
        int num = sc.nextInt();

        System.out.println((search(root,num)) ? "Found":"Not Found");

    }



    private static boolean search(BstNode root, int num) {
        if(root == null) return false;
        if(root.data == num) return true;
        if(num <= root.data) return search(root.left,num);
        return search(root.right,num);
    }

    private BstNode Insert(BstNode root, int data) {

        if (root == null)
            return createNewNode(data);
        else if (data <= root.data) {
            root.left = Insert(root.left, data);
        } else {
            root.right = Insert(root.right, data);
        }
        return root;
    }

    private BstNode createNewNode(int i) {
        BstNode node = new BstNode(i);
        return node;
    }
}
