/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toy.merchant;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author isaac
 */
public class SocketServer {
    
    static ServerSocket serversocket;
    static Socket socket;
    static Integer port_number;
    
    public void setConnection(Integer port_number) {
        try {
            serversocket = new ServerSocket(port_number);
            
            socket = serversocket.accept();          
        }
        catch(IOException ex){
            System.out.println("Exeption caught"+ ex);
        }
    }
    
    
    
    
}
