/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toy.merchant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class ClientProtocol {

    static DataInputStream data_in;
    static DataInputStream data_confirm;
    static DataOutputStream data_out;
    //static ObjectOutputStream objectOutputStream;

    /**
     * Everything related to the toys
     */
    public static void getToys() {

        SocketClient socketClient = new SocketClient();
        Socket socket = socketClient.getSocket();
        UUID uniqueKey = socketClient.getRandomUUID();
                
        new Thread() {
            @Override
            public void run() {
                try {
                    
                    String toy_information;
                    String confirmation;
                    data_in = new DataInputStream(socket.getInputStream());
                    data_confirm = new DataInputStream(socket.getInputStream());
                    data_out = new DataOutputStream(socket.getOutputStream());

                    
 
                    while (true) {
                        toy_information = data_in.readUTF();
                        switch (toy_information) {
                            case "Send Toy Identification":
                                {
                                   //Toy Identification
                                    ToyObject toy_object = new ToyObject();
                                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                                        objectOutputStream.writeObject(toy_object);
                                               
                                        objectOutputStream.flush();
                                        
                                    confirmation = data_confirm.readUTF();
                                    System.out.println("Server Says!: "+confirmation);
                                    JOptionPane.showMessageDialog(null, "Server Says!"+confirmation);
                                    break;
                                }
                            case "Send Toy Information":
                                {
                                    
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                                    //Toy Information
                                    ToyObject toy_object = new ToyObject();
                                    objectOutputStream.writeObject(toy_object);
                                    objectOutputStream.flush();
                                    
                                    confirmation = data_confirm.readUTF();
                                    System.out.println("Server Says!: "+confirmation);
                                    JOptionPane.showMessageDialog(null, "Server Says!"+confirmation);
                                    break;
                                }
                            case "Send Toy Manufacturer":
                                {
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                                    //Toy Manufacturer
                                    ToyObject toy_object = new ToyObject();
                                    objectOutputStream.writeObject(toy_object);
                                    objectOutputStream.flush();
                                    
                                    confirmation = data_confirm.readUTF();
                                    System.out.println("Server Says!: "+confirmation);
                                    JOptionPane.showMessageDialog(null, "Server Says!"+confirmation);
                                    break;
                                }
                            //Thank you + unique code
                            case "Send Thank you":
                            {
                                String Thank_you = "Thank You: "+uniqueKey;
                                data_out = new DataOutputStream(socket.getOutputStream());
                                data_out.writeUTF(Thank_you);
                                break;
                            }
                            case "Send All Information":
                                {
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                                    //All Information
                                    ToyObject toy_object = new ToyObject();
                                    objectOutputStream.writeObject(toy_object);
                                    objectOutputStream.flush();
                                    
                                    confirmation = data_confirm.readUTF();
                                    System.out.println("Server Says!: "+confirmation);
                                    JOptionPane.showMessageDialog(null, "Server Says!"+confirmation);
                                    break;
                                }
                            default:
                                System.out.println("Server is requesting for something else" + toy_information);
                                break;
                        }

                    }

                } catch (IOException ex) {
                    System.out.println("Exeption caught" + ex);
                }
            }
        }.start();

    }

}
