package edu.escuelaing.arem;

/**
 * @author Santiago Rocha
 */

public class Node {
    private Node next;
    private double data;

    /**
     * Constructor para los nodos que formas parte de la lista
     * 
     * @param data define el numero que va a tener esa posicion de la lista
     * @param next define el siguiente nodo en la lista, si es nulo este es el
     *             ultimo elemento
     */
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
