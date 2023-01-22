public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        //Empty
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createLinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insetNode(int nodeValue) {
        if (head == null) {
            createLinkedList(nodeValue);
        } else {
            Node newNode = new Node();
            newNode.setValue(nodeValue);
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    public void traversalLikedList() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                if (i < size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
            System.out.println("\n");

        }else {
            System.out.println("The Linked List does not exist.");
        }
    }

}
