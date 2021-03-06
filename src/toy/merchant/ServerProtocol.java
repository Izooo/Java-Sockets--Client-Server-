/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toy.merchant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class ServerProtocol extends javax.swing.JFrame {

    /**
     * Creates new form ServerProtocol
     */
    static ServerSocket ss;
    static Socket s;
    static DataInputStream data_in;
    static DataOutputStream data_out;
    Timestamp timestamp;

    public ServerProtocol() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        port_no = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TOY SERVER");

        msg_area.setEditable(false);
        msg_area.setColumns(20);
        msg_area.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        msg_area.setRows(5);
        jScrollPane1.setViewportView(msg_area);

        jButton1.setText("Toy Identification");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Toy Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Toy Manufacterer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Thank You");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("All Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("START");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Port Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(port_no, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(646, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(port_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        new Thread() {
            @Override
            public void run() {
                //get toy information
                try {
                    timestamp = new Timestamp(System.currentTimeMillis());
                    String Toy_Identification = "Send Toy Identification";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(Toy_Identification);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Server: "+Toy_Identification);
                    
                    System.out.println("server name: "+ss);
                    //incoming data
                    ObjectInputStream objectInputStream =  new ObjectInputStream(s.getInputStream());
                    
                    ToyObject toy_object = (ToyObject) objectInputStream.readObject();
                    
                    String confirmation = "Successfully Received!";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(confirmation);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Client: Toy Code: " + toy_object.getToy_Code()+" - Toy Name: "+toy_object.getToy_Name()+"\n");
                    
                } catch (Exception ex) {
                    System.out.println("Server Exception caught 1: " + ex);
                    JOptionPane.showMessageDialog(null, "Sorry an Error has occured. Please Try again", "Inane error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Integer port_number;
        port_number = Integer.parseInt(port_no.getText());

        if (port_number >= 0 && port_number <= 65535) {
            new Thread() {
                @Override
                public void run() {
                    
                    try {
                        System.out.println("The port number: " + port_number);
                        
                        timestamp = new Timestamp(System.currentTimeMillis());
                        ss = new ServerSocket(port_number);
                        msg_area.setText("  \b [ "+timestamp+" ] Server: Waiting for Clients");
                        new toy_client_home().setVisible(true);
                        s = ss.accept();
                        
                        System.out.println("Connection established");
                        msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Server: Connection established");
                    } catch (Exception ex) {
                        System.out.print("server Exception caught: " + ex);
                        JOptionPane.showMessageDialog(null, "Sorry an Error has occured. Port already in use.", "inane error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }.start();
        } else {
            System.out.println("unrecognizable port range");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Thread() {
            @Override
            public void run() {
                //get toy information
                try {
                    timestamp = new Timestamp(System.currentTimeMillis());
                    String Toy_Identification = "Send Toy Information";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(Toy_Identification);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n  \b [ "+timestamp+" ] Server: "+Toy_Identification+"\n");
                    
                    //Incoming data
                    ObjectInputStream objectInputStream = new ObjectInputStream(s.getInputStream());

                    ToyObject toy_object = (ToyObject) objectInputStream.readObject();
                    
                    String confirmation = "Successfully Received!";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(confirmation);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Client: Toy Name: " + toy_object.getToy_Name()+" - Toy description: "+toy_object.getToy_Description()+" - Toy Price: "+toy_object.getToy_Price()+" - Toy Date of Manufacture: "+
                            toy_object.getToy_Date_of_Manufacture()+" - Toy Batch No: "+toy_object.getToy_Batch_No()+"\n");
                } catch (Exception ex) {
                    System.out.println("Server Exception caught 2: " + ex);
                }
            }
        }.start();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Thread() {
            @Override
            public void run() {
                //get toy information
                try {
                    timestamp = new Timestamp(System.currentTimeMillis());
                    String Toy_Identification = "Send Toy Manufacturer";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(Toy_Identification);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Server: "+Toy_Identification);
                    
                    //incoming data
                    ObjectInputStream objectInputStream = new ObjectInputStream(s.getInputStream());

                    ToyObject toy_object = (ToyObject) objectInputStream.readObject();
                    
                    String confirmation = "Successfully Received!";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(confirmation);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Client: Toy Company Name: " + toy_object.getToy_Company()+" - Toy Street Address: "+toy_object.getToy_Street_address()+" - Toy Zip-Code: "+toy_object.getToy_Zip_code()+" - Toy Country Origin: "+
                            toy_object.getToy_Country()+"\n");
                } catch (Exception ex) {
                    System.out.println("Server Exception caught 3: " + ex);
                }
            }
        }.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Thread() {
            @Override
            public void run() {
                //Get Thank You
                try {
                    timestamp = new Timestamp(System.currentTimeMillis());
                    String Toy_Identification = "Send Thank you";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(Toy_Identification);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Server: "+Toy_Identification+"\n");
                    
                    //incoming data
                    String Thank_you_message;
                    
                    data_in = new DataInputStream(s.getInputStream());
                    Thank_you_message = data_in.readUTF();
                    
                    JOptionPane.showMessageDialog(null, Thank_you_message);
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Client: "+Thank_you_message+"\n");
                    
                } catch (Exception ex) {
                    System.out.println("Server Exception caught 4: " + ex);
                }
            }
        }.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Thread() {
            @Override
            public void run() {
                //get toy information
                try {
                    timestamp = new Timestamp(System.currentTimeMillis());
                    String Toy_Identification = "Send All Information";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(Toy_Identification);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Server: "+Toy_Identification);
                    
                    //incoming data
                    ObjectInputStream objectInputStream =  new ObjectInputStream(s.getInputStream());
                    
                    ToyObject toy_object = (ToyObject) objectInputStream.readObject();
                    
                    String confirmation = "Successfully Received!";
                    data_out = new DataOutputStream(s.getOutputStream());
                    data_out.writeUTF(confirmation);
                    
                    msg_area.setText(msg_area.getText().trim()+"\n\n \b [ "+timestamp+" ] Client: Toy Code: " + toy_object.getToy_Code()+" Toy Name: " + toy_object.getToy_Name()+" - Toy description: "+toy_object.getToy_Description()+" - Toy Price: "+toy_object.getToy_Price()+" - Toy Date of Manufacture: "+
                            toy_object.getToy_Date_of_Manufacture()+" - Toy Batch No: "+toy_object.getToy_Batch_No()+"\n - Toy Company Name " + toy_object.getToy_Company()+" - Toy Street Address: "+toy_object.getToy_Street_address()+" - Toy Zip-Code: "+toy_object.getToy_Zip_code()+" - Toy Country Origin: "+
                            toy_object.getToy_Country()+"\n");
                    
                } catch (Exception ex) {
                    System.out.println("Server Exception caught 5: " + ex);
                }
            }
        }.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerProtocol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerProtocol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerProtocol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerProtocol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerProtocol().setVisible(true);
            }

        });

        /*String msg_in =  "";
        try{

            data_in = new DataInputStream(s.getInputStream());
            data_out = new DataOutputStream(s.getOutputStream());

            msg_in = data_in.readUTF();
            msg_area.setText(msg_area.getText().trim()+"\n Client: \t"+msg_in);
            System.out.println("messages from the server"+msg_in );
        }
        
        catch(Exception ex){
            System.out.println("Exception is: "+ex);
        }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea msg_area;
    private javax.swing.JTextField port_no;
    // End of variables declaration//GEN-END:variables
}
