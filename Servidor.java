/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.Math_Socket_Project_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valerine
 */
public class Servidor {
    
    public static void main (String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in; 
        DataOutputStream out; 
        
        final int Puerto = 5000;
        
        try {
           
            servidor = new ServerSocket(Puerto);
            System.out.println("Servidor iniciado");
            // Para que el servidor este siempre a la espera 
            while (true) {
            
            sc = servidor.accept();
            
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            String mensaje = in.readUTF();
            
            System.out.print(mensaje);
            
            out.writeUTF("Hola desde servidor");
            // Cierra el cliente 
            sc.close();
            System.out.println("Cliente desconectado");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
