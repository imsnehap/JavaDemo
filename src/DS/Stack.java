package DS;


public class Stack{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }

    }
    static Node head;
    boolean isEmpty(){
        if( head == null){
            return true;
        }
        return false;
    }

    void push(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            return;
        }
        node.next =head;
        head = node;
    }
     void pop(){
        if(isEmpty()){
            return ;
        }
        head = head.next;

    }
    Node peek(){
        return head;
    }

    void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.printStack();
        //s.peek();
        System.out.println("Peek : "+s.peek().data);
        System.out.println("Pop started ");
        s.pop();
        s.printStack();


    }


}
