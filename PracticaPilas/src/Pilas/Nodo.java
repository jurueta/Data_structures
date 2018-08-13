/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author Urueta
 * @param <U>
 */
public class Nodo<U> {
    private U dato;
    private Nodo<U> next;

    public Nodo() {
    }

    public Nodo(U dato) {
        this.dato = dato;
    }

    public U getDato() {
        return dato;
    }

    public void setDato(U dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return dato.toString() ;
    }
    
    
}
