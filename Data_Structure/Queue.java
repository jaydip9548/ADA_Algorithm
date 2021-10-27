package Data_Structure;


// we are imagine circular queue bcs linear queue we get Empty space after removing..


import java.util.Scanner;

public class Queue {
    static int front = -1, rear = -1;
    static int arr[] = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean F = true;
        while (F) {
            System.out.println("Enter 1 for insert and 2 for remove  and 3 for exit :  ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Insert item : ");
                    Enqueue(sc.nextInt());
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    F = false;
                    break;
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Enqueue(sc.nextInt());
        }


    }

    private static void dequeue() {

        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }else if(front == rear){
            System.out.println("Removed Element is : "+arr[front]);
            front = rear = -1;
        }else{
            System.out.println("Removed Element is : "+arr[front]);
            front = (front+1) % arr.length;
        }

    }

    private static void Enqueue(int i) {

        if ((rear+1) % arr.length == front) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear =(rear+1) % arr.length;
        }
        arr[rear] = i;
    }

    public static boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        else
            return false;
    }

    public static boolean isFull() {
        if (rear == arr.length - 1)
//            System.out.println("Queue is Full");
            return true;
        else
            return false;

    }

}
