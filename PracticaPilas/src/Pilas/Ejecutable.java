/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author Urueta
 */
public class Ejecutable {
    public static void main(String[] args) {
        ListaPila<Integer> pila = new ListaPila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(5);
        System.out.println(pila.peek());
        System.out.println(pila);
    }
}
