/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Based on Crunchify.com
 * @author MCC. Jorge Isaac V. Moran
 */
public class PriorityQueue<V> {
    // Instance Variables. Add the tail reference.
    protected NodoDP<V> head;
    protected NodoDP<V> tail;
    protected long size;
 
    // Empty queue constructor first
    public PriorityQueue() {
        head = null;
        tail = null;
        size = 0;
    } 
 
    /**
     * Method to add Nodes to the queue.
     * Storage space for the Node is already allocated in the calling method
     */
    public void add(NodoDP<V> newNode) {
        //El primer nodo en la cola
        if (tail == null && head == null) {
            addVeryFirst(newNode);
            size++;
        }
        //El nodo con mas baja prioridad
        else if ( newNode.getPriority() <= head.getPriority() ) {
            addFirst(newNode);
        }
        //El nodo con mas alta prioridad
        else if ( newNode.getPriority() > tail.getPriority() ) {
            addLast(newNode);
        }
        //El nodo con prioridad intermedia
        else {
            NodoDP<V> tNode = head.getNext();
            while ( newNode.getPriority() > tNode.getPriority() ) {
                tNode = tNode.getNext();
            }
            tNode = tNode.getBefore();
            addAfter(tNode, newNode);
        }
    }
    
    // Add new Node before the head Node.
    private void addFirst(NodoDP<V> newNode) {
        // Set the tail only if this is the very first Node
        if (tail == null && head == null) addVeryFirst(newNode);
        else {
            newNode.setNext(head); // Make next of the new Node refer to the head
            newNode.setBefore(null);
            head.setBefore(newNode); // Make the double link
            head = newNode; // Give head a new value
        }
        // change the size
        size++;
    } 
 
    // Add new Node after current Node, checking to see if we are at the tail
    private void addAfter(NodoDP<V> currentNode, NodoDP<V> newNode) {
        if (currentNode == tail) addLast(newNode);
        else {
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            newNode.setBefore(newNode.getNext().getBefore());
            newNode.getNext().setBefore(newNode);
            // change the size
            size++;
        }
    } 
 
    // Add new Node after the tail Node.
    private void addLast(NodoDP<V> newNode) {
        if (tail == null && head == null) addVeryFirst(newNode);
        else {
            newNode.setNext(null);
            newNode.setBefore(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        // change the size
        size++;
    }
    
    // Add very first node in the double queue
    private void addVeryFirst(NodoDP<V> newNode) {
        head = newNode; // Give head a new value
        newNode.setNext(null);
        newNode.setBefore(null);
        tail = newNode; // Give tail a new value
    }
 
    /**
     * Methods to remove Nodes from the queue.
     *
     * Remove the Node at the end of the queue.
     * Since the queue is double linked,
     * there is no need to traverse the queue.
     */
    public NodoDP<V> remove() {
        // Declare local variables/objects
        NodoDP<V> Before;
        NodoDP<V> ToRemove;
 
        // Make sure we have something to remove
        if (size == 0)
            System.err.println("Error:  Attempt to remove fron an empty queue");

        // Save the node before the last Node
        Before = tail.getBefore();
        // Save the last Node
        ToRemove = tail;
        
        if ( head == tail ) { /* Is the last Node in the queue */
            head = null;
            tail = null;
        }
        else {
            // Let's do the pointer manipulation
            Before.setNext(null);
            tail = Before;
        }
        ToRemove.setBefore(null);
        ToRemove.setNext(null);
        size--;
 
        return ToRemove;
    } 
 
    // The gets to return the head and/or tail Nodes and size of the queue
    public NodoDP<V> getFirst() {
        return head;
    }
 
    public NodoDP<V> getLast() {
        return tail;
    }
 
    public long getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return ( size == 0 )?true:false;
    }
    
}
