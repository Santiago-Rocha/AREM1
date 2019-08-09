package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
public class LinkedList {
    private Head head;

    public LinkedList() {
        head = new Head(null, null);
    }

    public void add(int num) {
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

}
