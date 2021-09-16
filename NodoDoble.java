/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.Math_Socket_Project_1;

/**
 *
 * @author Valerine
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    //Constructor para cuando haya nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a){
         dato=el;
         siguiente=s;
         anterior=a;
    }
}
