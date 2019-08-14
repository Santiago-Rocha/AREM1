package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
public class LinkedList {
    private Head head;
    private int size;

    public LinkedList() {
        head = new Head(null, null);
    }

    public void add(double num) {
        Node node = new Node(num, null);
        if (head.getFirst() == null)
            head.setFirst(node);
        else {
            Node pointer = head.getFirst();
            while (pointer.nextNode() != null) {
                pointer = pointer.nextNode();
            }
            pointer.setNext(node);
        }
        size++;
        head.setLast(node);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node pointer = head.getFirst();
        while (pointer != null) {
            sb.append(pointer.geData()).append(" ");
            pointer = pointer.nextNode();
        }
        return sb.toString().trim();

    }

    public int  getSize(){
        return size;
    }

    public Node getFirst(){
        return head.getFirst();
    }



}
