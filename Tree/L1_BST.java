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
        l1.Insert(root, 15);
        l1.Insert(root, 25);
        l1.Insert(root, 35);
        l1.Insert(root, 45);
        l1.Insert(root, 55);
//        l1.Insert(root, 10);
//        l1.Insert(root, 20);
//        l1.Insert(root, 8);
//        l1.Insert(root, 12);
//        l1.Insert(root, 17);
//        l1.Insert(root, 25);

//        System.out.println("Enter number you want to search  : ");
//        int num = sc.nextInt();

//        System.out.println((search(root,num)) ? "Found":"Not Found");

//        Find min

//        System.out.println("Min number : "+l1.findMin(root));
//
//        System.out.println("Max number : "+l1.findMax(root));

//        Find Height

        System.out.println("Height of tree : " + l1.getHeight(root));

    }

    private int getHeight(BstNode root) {

        if (root == null) return -1;

        int leftHeight = getHeight(root.left);

        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }


    private static boolean search(BstNode root, int num) {
        if (root == null) return false;
        if (root.data == num) return true;
        if (num <= root.data) return search(root.left, num);
        return search(root.right, num);
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


    private int findMin(BstNode root) {


        BstNode temp = root;
//        while(temp.left != null){
//            temp = temp.left;
//        }
//
//        return temp.data;

        if (temp.left == null)
            return temp.data;

        return findMin(temp.left);
    }

    private int findMax(BstNode root) {
        BstNode temp = root;


        if (temp.right == null)
            return temp.data;

        return findMax(temp.right);


    }

    private BstNode createNewNode(int i) {
        BstNode node = new BstNode(i);
        return node;
    }
}


//    Iterative

//    public void InsertNode(int item) {
//
//        Practice.Node n = new Practice.Node(item);
//
//        if (root == null) {
//            root = n;
//        } else {
//            Practice.Node temp = root;
//            Practice.Node ex = null;
//            while (temp != null) {
//                if (temp.data >= item) {
//                    ex = temp;
//                    temp = temp.prev;
//                } else {
//                    ex = temp;
//                    temp = temp.next;
//                }
//            }
//            if (ex.data >= item) {
//                ex.prev = n;
//            } else {
//                ex.next = n;
//            }
//        }
//    }
