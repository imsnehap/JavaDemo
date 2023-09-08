package DS;


public class LinkList {
    Node head;
    int size;

    LinkList() {
        this.size = 0;
    }

    private class Node {

        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;
    }

    public void addAny(String data, int atPosition) {
        Node newNode = new Node(data);
        if (atPosition > size + 1) {
            return;
        }
        if (atPosition == 0) {
            addFirst(data);
            return;
        }
        Node currentNode = head;
        int nodeCount = 0;
        while (currentNode.next != null) {
            nodeCount++;
            if (nodeCount == atPosition) {
                break;
            }
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.print("LL is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;
        }
        System.out.print("\n");

    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast() {
        //empty LL
        if (head == null) {
            return;
        }
        //Only single node
        if (head.next == null) {
            head = null;
            return;
        }

        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size--;
    }

    public void delete(String data) {
        //empty LL
        if (head == null) {
            return;
        }
        //Only single node
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node currentNode = head;
        // boolean found = false;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                //found = true;
                break;
            }
            currentNode = currentNode.next;
        }
        // if(found)
        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            size--;
        }
    }

    private void reverseLL() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    private Node reverseLLRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLLRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {

        LinkList ll = new LinkList();
        ll.addFirst("a");
        ll.addLast("b");
        ll.addLast("c");
        ll.printList();
        ll.reverseLL();
        ll.printList();


    }
}