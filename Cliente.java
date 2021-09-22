/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.Math_Socket_Project_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valerine
 */
public class Cliente {
    
    public static void main(String[] args) {
      
            // Conectarme a mi maquina
            final String Host= "127.0.0.1";
            final int Puerto = 5000;
            DataInputStream in; 
            DataOutputStream out; 
            
          try {    
            Socket sc = new Socket(Host,Puerto);
            
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            
           out.writeUTF("Hola desde cliente");
           
           String mensaje = in.readUTF();
           System.out.println(mensaje);
           
           sc.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
 
