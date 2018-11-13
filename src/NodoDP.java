/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Based on Crunchify.com
 * @author MCC. Jorge Isaac V. Moran
 */
public class NodoDP<V> {
    private int priority;
    private V element;
    private NodoDP<V> next;
    private NodoDP<V> before;
 
    public NodoDP() {
        this(0, null, null, null); 
    }
 
    public NodoDP(int priority, V element, NodoDP<V> next, NodoDP<V> before) {
        this.priority = priority;
        this.element = element;
        this.next = next;
        this.before = before;
    }
    
    public int getPriority() {
        return priority;
    }
 
    public V getElement() {
        return element;
    }
 
    public NodoDP<V> getNext() {
        return next;
    }
 
    public NodoDP<V> getBefore() {
        return before;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public void setElement(V element) {
        this.element = element;
    }
 
    public void setNext(NodoDP<V> next) {
        this.next = next;
    }
    
    public void setBefore(NodoDP<V> before) {
        this.before = before;
    }
}
