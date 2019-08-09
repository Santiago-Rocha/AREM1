package edu.escuelaing.arem;

public class Head 
{
    private Node first;
    private Node last;
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

