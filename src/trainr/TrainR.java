/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainr;

import com.dosse.upnp.UPnP;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

/**
 *
 * @author kaladin
 */
public class TrainR {
 private static final int PORT = 1433;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
    traindb dr= new traindb();
    
    try {
            System.out.println("Opening socket...");
            final ServerSocket ss = new ServerSocket(PORT); //starts listening on port TCP 4137
            System.out.println("Socket opened");            
            //create a new thread that listens for incoming conenctions
            new Thread() {
                @Override
                public void run() {
                    for (;;) {
                        try {
                            Socket s = ss.accept(); //wait for connections on socket
                            System.out.println("Incoming connection from " + s.getInetAddress().getHostAddress()); //print remote machine IP
                            s.close(); //close the connection
                        } catch (Throwable t) {
                            System.err.println("Network error: "+t);
                        }
                    }
                }
            }.start();
            //meanwhile, we try to open the port on the local gateway
            System.out.println("Attempting UPnP port forwarding...");
            if (UPnP.isUPnPAvailable()) { //is UPnP available?
                if (UPnP.isMappedTCP(PORT)) { //is the port already mapped?
                    System.out.println("UPnP port forwarding not enabled: port is already mapped");
                } else if (UPnP.openPortTCP(PORT)) { //try to map port
                    System.out.println("UPnP port forwarding enabled");
                } else {
                    System.out.println("UPnP port forwarding failed");
                }
            } else {
                System.out.println("UPnP is not available");
            }

        } catch (Throwable t) {
            System.err.println("Network error: "+t);
        }
    
    TrainRLogin log = new TrainRLogin();
    log.setVisible(true);

    }
    
    }
    
    

