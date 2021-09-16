/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.Math_Socket_Project_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Valerine
 */
public class generateboxes {
    private NodoDoble inicio,fin;
    public generateboxes(){
    inicio=fin=null;
    }
    //metodo para saber cuando la lista està vacia 
    public boolean Vacio (){
        return inicio==null;
    }
    //metodo para agregar nodos al final
    public void AgregarNF(int el){
      if (!Vacio()){
        fin=new NodoDoble (el,null,fin);
        fin.anterior.siguiente=fin;
      }else{
        inicio=fin=new NodoDoble(el);    
    }
   }
    // Metodo para agregar al inicio 
    public void AgregarNI(int el){
      if (!Vacio()){
         inicio=new NodoDoble (el,inicio,null);
         inicio.siguiente.anterior=inicio;
     }else{
      inicio=fin=new NodoDoble(el);
      }
    }
    //Para mostar la lista inicio a fin 
    public void MostrarlistaIF(){
        if (!Vacio()){
            String datos="<=>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){ // Si aux dife a null se van a mostrar los datos
                datos = datos + "["+auxiliar.dato+"]<=>"; 
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, dato, "Mostrando lista inicio a fin",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
