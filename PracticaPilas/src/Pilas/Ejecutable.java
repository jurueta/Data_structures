/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Urueta
 */
public class Ejecutable {
    public static void main(String[] args) throws IOException {
        System.out.println(getString("datos.txt"));
        if (validarExpresion(getString("datos.txt"))) {
            System.out.println("esta bien");  
        }else{
            System.out.println("esta mal");
        }
    }
       public static boolean validarExpresion(String cadena){
        ListaPila <Character> pila = new ListaPila<>();
        char actual, anterior;
        for (int i = 0; i < cadena.length(); i++) {
        actual = cadena.charAt(i);
            if (actual == '{' || actual == '('||actual == '[') {
                pila.push(actual);
            } else {
                if (actual == '}' || actual == ')'||actual == ']') {
                    anterior = (char)pila.peek().getDato();
                     if (actual == '}' && anterior == '{' || actual == ')' && anterior == '(' || actual == ']' && anterior == '[') {
                        pila.pull();
                    }
                }
            }
        }
       return pila.IsEmpty(); 
    }
        public static String getString(String archivo) throws IOException{
       String dato = null;
        try {
           FileReader file = new FileReader(archivo);
           BufferedReader bufe = new BufferedReader(file);
           dato = bufe.readLine();
       } catch (FileNotFoundException ex) {
           System.out.println("El archivo no se encuentra");
       }
       return dato; 
    }
      
}
