package Data_Structure;


import java.util.Scanner;
import java.util.Stack;

public class stack {
    static int arr[] = new int[10];
    static int top = -1;
    static int max = 10;

    public static void main(String[] args) {

//        push(10);push(20);push(30);push(40);
//        pop();
//        peek();
//        display();


//        Stack data Structure in Collections

        ImplementedStack();


    }

    private static void ImplementedStack() {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(89);
        stack.push(30);
        stack.push(48);
        stack.push(16);
        stack.push(98);

        System.out.println(stack);
//        System.out.println("Poped Item "+stack.pop());
        System.out.println("Toped Element  " + stack.peek());
//        returns the index of element else -1
        System.out.println(stack.search(30));

        System.out.println(stack.isEmpty());
    }

    private static void display() {
        while (top != -1) {
            System.out.println(arr[top--]);
        }
    }

    private static void peek() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        } else {
            System.out.println("Peek value is : " + arr[top]);
        }
    }

    private static void pop() {

        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        } else {
            System.out.println(arr[top] + " is removed");
            arr[top] = 0;
            top--;
        }
    }

    private static void push(int i) {
        if (top == max - 1) {
            System.out.println("Stack is Overflow ");
            return;
        } else {
            top++;
            arr[top] = i;
        }

    }

}
