/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toy.merchant;

import java.io.DataInputStream;
import java.net.Socket;
import java.util.UUID;

/**
 *
 * @author isaac
 */
public class SocketClient {
    
    static Socket soc;
    static String toy_server_name;
    static Integer port_number;
    static UUID uniqueKey;
    
    
    public void setConnection(String toy_server_name,Integer port_number) {
        try {
            soc = new Socket(toy_server_name,port_number);           
        }
        catch(Exception ex){
            System.out.println("Exeption caught"+ ex);
        }
    }
    public Socket getSocket(){
        System.out.println("The socket is: "+soc);
        return soc;
    }
    
    public UUID getRandomUUID(){
        
        uniqueKey = UUID.randomUUID();   
        return uniqueKey;
    }
    
}
