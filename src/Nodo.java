/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Based on Crunchify.com
 * @author MCC. Jorge Isaac V. Moran
 */
public class Nodo<V> {
    private V element;
    private Nodo<V> next;
 
    public Nodo() {
        this(null, null); 
    }
 
    public Nodo(V element, Nodo<V> next) {
        this.element = element;
        this.next = next;
    }
 
    public V getElement() {
        return element;
    }
 
    public Nodo<V> getNext() {
        return next;
    }
 
    public void setElement(V element) {
        this.element = element;
    }
 
    public void setNext(Nodo<V> next) {
        this.next = next;
    }
}
