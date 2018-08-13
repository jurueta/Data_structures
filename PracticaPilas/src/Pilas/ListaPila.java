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
public class ListaPila<U> {
   private Nodo<U> top;
   private int Size = 0;
   
    public ListaPila() {
    }
   
    public boolean IsEmpty(){
        return top == null;
    }
    
    public void push(U dato){
        Nodo<U> nuevoNodo = new Nodo<>(dato);
        if (IsEmpty()) {
            top = nuevoNodo;
        } else {
            nuevoNodo.setNext(top);
            top = nuevoNodo;
        }
         Size++;
    }
    
    public void pull(){
        top = top.getNext();
        Size--;
    }
    
    public Nodo peek(){
        return top;
    }

    @Override
    public String toString() {
        Nodo<U> NodoTemporal = top;
        String Listado  = "";
        Listado += " _ \n"; 
        while(NodoTemporal != null){
            Listado += "|"+NodoTemporal.toString()+"|\n";
            NodoTemporal = NodoTemporal.getNext();
        }
        Listado += " Y el tamaño es "+Size;
        return Listado;
    }
      
}
