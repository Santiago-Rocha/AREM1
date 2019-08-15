package edu.escuelaing.arem;

/**
 * @author Santiago Rocha
 */

public class Node<T> {
    private Node<T> next;
    private T data;

    /**
     * Constructor para los nodos que formas parte de la lista
     * 
     * @param data define el numero que va a tener esa posicion de la lista
     * @param next define el siguiente nodo en la lista, si es nulo este es el
     *             ultimo elemento
     */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node<T> nextNode() {
        return next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public T geData() {
        return data;
    }
}
