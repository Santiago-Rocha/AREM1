package edu.escuelaing.arem;

public class Node {
    private Node next;
    private int data;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node nextNode() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public int geData() {
        return data;
    }
}
