package edu.escuelaing.arem;

/** 
 * @author Santiago Rocha 
*/

public class LinkedList<T> {
    private Head<T> head;
    private int size;

    public LinkedList() {
        head = new Head<T>(null, null);
    }

    /**
     * Metodo que agrega un nuevo nodo a la lista
     * @param num define el valor del nodo que se va a agregar
     */
    public void add(T value) {
        Node<T> node = new Node<T>(value, null);
        if (head.getFirst() == null)
            head.setFirst(node);
        else {
            Node<T> pointer = head.getFirst();
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
        Node<T> pointer = head.getFirst();
        while (pointer != null) {
            sb.append(pointer.geData()).append(" ");
            pointer = pointer.nextNode();
        }
        return sb.toString().trim();

    }

    public int  getSize(){
        return size;
    }

    public Node<T> getFirst(){
        return head.getFirst();
    }



}
