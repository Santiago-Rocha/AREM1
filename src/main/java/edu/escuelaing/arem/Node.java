package edu.escuelaing.arem;

public class Node {
    private Node next;
    private double data;

    public Node(double data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node nextNode() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public double geData() {
        return data;
    }
}
