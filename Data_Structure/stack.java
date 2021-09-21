package Data_Structure;


public class stack {
   static int arr[] = new int[100];
   static int top = -1;
   static int max = 100;

    public static void main(String[] args) {

        push(10);push(20);push(30);push(40);
        pop();
        peek();
        display();
    }

    private static void display() {
        while(top != -1){
            System.out.println(arr[top--]);
        }
    }

    private static void peek() {
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }else{
            System.out.println("Peek value is : "+arr[top]);
        }
    }

    private static void pop() {

        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }else{
            System.out.println(arr[top] +" is removed");
            arr[top] = 0;
            top--;
        }
    }

    private static void push(int i) {
        if(top == max-1 )
        {
            System.out.println("Stack is Overflow ");
            return;
        }
        else{
            top++;
            arr[top ] = i;
        }

    }

}
