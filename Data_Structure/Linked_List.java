package Data_Structure;

public class Linked_List {

    Node head = null, tail = null;


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();

    }

    public void add(int item) {

        Node node = new Node(item);

        if (head == null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public void display(){

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    
}
