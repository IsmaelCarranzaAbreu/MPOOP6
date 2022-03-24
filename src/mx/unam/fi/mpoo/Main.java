/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.fi.mpoo; //Dentro de 

import controlador.Sumadora;


/**
 *
 * @author Ismael
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase Empaquetada");
        Sumadora sumadora = new Sumadora();
        double suma = sumadora.sumar(3, 4);
        System.out.println(suma);
        
        
    }
}
