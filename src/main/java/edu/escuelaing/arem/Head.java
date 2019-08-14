package edu.escuelaing.arem;

/** 
 * @author Santiago Rocha 
*/
public class Head 
{
    private Node first;
    private Node last;

    /**
     * Constructor para la cabeza de la lista encadenada
     * @param first define el primer nodo de la lista
     * @param last  define el ultimo nodo de la lista
     */
    public Head(Node first, Node last){
        this.first = first;
        this.last = last;
    }

    public Node getFirst(){
        return first;
    }

    public void setFirst(Node node){
        first = node;
    }
    
    public Node getLast(){
        return last;
    }

    public void setLast(Node node){
        last = node;
    }
}

