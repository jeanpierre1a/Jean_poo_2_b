/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
    public static void main(String []args){
        Cliente cl1= new Cliente();
        Persona p1= new Persona ();
        
        cl1.setTelefono("0988374116");
        p1.setNombre("Jean");
        p1.setEdad(19);
        
        System.out.println(p1.toString());
        System.out.println(cl1.toString());
    }
}
