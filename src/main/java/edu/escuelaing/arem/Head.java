package edu.escuelaing.arem;

/** 
 * @author Santiago Rocha 
*/
public class Head<T>
{
    private Node<T> first;
    private Node<T> last;

    /**
     * Constructor para la cabeza de la lista encadenada
     * @param first define el primer nodo de la lista
     * @param last  define el ultimo nodo de la lista
     */
    public Head(Node<T> first, Node<T> last){
        this.first = first;
        this.last = last;
    }

    public Node<T> getFirst(){
        return first;
    }

    public void setFirst(Node<T> node){
        first = node;
    }
    
    public Node<T> getLast(){
        return last;
    }

    public void setLast(Node<T> node){
        last = node;
    }
}

